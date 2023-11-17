// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MyDrive extends SubsystemBase {

PWMSparkMax leftFront;
PWMSparkMax rightFront;
PWMSparkMax leftBack;
PWMSparkMax rightBack;

MotorControllerGroup leftGroup;
MotorControllerGroup righGroup;

DifferentialDrive drive;

  /** Creates a new MyDrive. */
  public MyDrive() {

    leftFront = new PWMSparkMax(0);
    rightFront = new PWMSparkMax(1);
    leftBack = new PWMSparkMax(2);
    rightBack = new PWMSparkMax(3);

    leftGroup = new MotorControllerGroup(leftFront, leftBack);
    righGroup = new MotorControllerGroup(rightFront, rightBack);

    leftGroup.setInverted(true);
    righGroup.setInverted(false);

    drive = new DifferentialDrive(leftGroup, righGroup);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
