// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.JackSubsystem;

public class JackCommand extends Command {
  /** Creates a new JackCommand. */
  JackSubsystem jack;
  XboxController control;
  public JackCommand(JackSubsystem jack, XboxController control) {
    this.jack = jack;
    this.control = control;
    addRequirements(jack);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (control.getPOV() == 90){
      jack.move(1);
    }
    else if (control.getPOV() == 270){
      jack.move(-1);
    }
    else{
      jack.move(0);
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
