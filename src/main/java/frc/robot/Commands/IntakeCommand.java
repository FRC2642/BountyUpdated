// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.IntakeSubsystem;

public class IntakeCommand extends Command {
  /** Creates a new IntakeCommand. */
  IntakeSubsystem intake;
  XboxController control;
  public IntakeCommand(IntakeSubsystem intake, XboxController control) {
    this.intake = intake;
    this.control = control;
    addRequirements(intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (control.getLeftTriggerAxis() >= 0.1){
      intake.setIntake(control.getLeftTriggerAxis());
    }
    else if (control.getRightTriggerAxis() >= 0.1){
      intake.setIntake(-control.getRightTriggerAxis());
    }
    else{
      intake.setIntake(0);
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
