// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.RollerSubsystem;

public class RollerCommand extends Command {
  /** Creates a new RollerComman. */
  RollerSubsystem roller;
  XboxController control;
  public RollerCommand(RollerSubsystem roller, XboxController control) {
    this.roller = roller;
    this.control = control;
    addRequirements(roller);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (control.getLeftBumper()){
      roller.setRoller(0.7);
    }
    else if (control.getRightBumper()){
      roller.setRoller(-0.7);
    }
    else{
      roller.setRoller(0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
