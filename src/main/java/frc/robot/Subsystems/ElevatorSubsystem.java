// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElevatorSubsystem extends SubsystemBase {
  /** Creates a new ElevatorSubsystem. */
  private TalonSRX elevatorMotor1 = new TalonSRX(14);
  private TalonSRX elevatorMotor2 = new TalonSRX(15);

  public ElevatorSubsystem() {
    elevatorMotor2.follow(elevatorMotor1);
  }

  public void setElevator(double speed){
    elevatorMotor1.set(TalonSRXControlMode.PercentOutput, speed * 0.7);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
