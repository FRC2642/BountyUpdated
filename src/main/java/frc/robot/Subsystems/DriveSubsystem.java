// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix.sensors.WPI_PigeonIMU;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */

  private CANSparkMax rightMotor1 = new CANSparkMax(1, MotorType.kBrushless);
  private CANSparkMax rightMotor2 = new CANSparkMax(16, MotorType.kBrushless);
  private CANSparkMax leftMotor1 = new CANSparkMax(2, MotorType.kBrushless);
  private CANSparkMax leftMotor2 = new CANSparkMax(3, MotorType.kBrushless);

  private WPI_PigeonIMU gyro = new WPI_PigeonIMU(18);

  private DifferentialDrive diffDrive = new DifferentialDrive(rightMotor1, leftMotor1);

  public DriveSubsystem() {
    rightMotor2.follow(rightMotor1);
    leftMotor2.follow(leftMotor1);

    leftMotor1.setInverted(true);
    leftMotor2.setInverted(true);
  }

  public void move(double speed, double rotation){
    diffDrive.arcadeDrive(speed * 0.5, rotation * 0.2);
  }

  public double getYaw(){
    return gyro.getYaw();
  }

  public void resetGyro(){
    gyro.reset();
  }

  @Override
  public void periodic() {
  }
}
