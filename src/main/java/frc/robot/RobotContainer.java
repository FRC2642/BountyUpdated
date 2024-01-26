// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Commands.ClimberCommand;
import frc.robot.Commands.DriveCommand;
import frc.robot.Commands.DriveStraightCommand;
import frc.robot.Commands.ElevatorCommand;
import frc.robot.Commands.IntakeCommand;
import frc.robot.Commands.JackCommand;
import frc.robot.Commands.RollerCommand;
import frc.robot.Subsystems.ClimberSubsystem;
import frc.robot.Subsystems.DriveSubsystem;
import frc.robot.Subsystems.ElevatorSubsystem;
import frc.robot.Subsystems.IntakeSubsystem;
import frc.robot.Subsystems.JackSubsystem;
import frc.robot.Subsystems.RollerSubsystem;

public class RobotContainer {
  XboxController control = new XboxController(0);

  DriveSubsystem drive = new DriveSubsystem();
  IntakeSubsystem intake = new IntakeSubsystem();
  ElevatorSubsystem elevator = new ElevatorSubsystem();
  ClimberSubsystem climber = new ClimberSubsystem();
  JackSubsystem jack = new JackSubsystem();
  RollerSubsystem roller = new RollerSubsystem();

  public RobotContainer() {
    drive.setDefaultCommand(new DriveCommand(drive, control));
    intake.setDefaultCommand(new IntakeCommand(intake, control));
    elevator.setDefaultCommand(new ElevatorCommand(elevator, control));
    climber.setDefaultCommand(new ClimberCommand(climber, control));
    jack.setDefaultCommand(new JackCommand(jack, control));
    roller.setDefaultCommand(new RollerCommand(roller, control));
    configureBindings();
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
