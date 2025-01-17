// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public final class Constants {
  public static class DriveConstants {
    public static final int DRIVER_CONTROLLER_PORT = 0;
    public static final int OPERATOR_CONTROLLER_PORT = 1;
  }

  public static class MotorIdConstants {
    public static final int LEFT_CLIMBER_MOTOR_ID = 13;
    public static final int RIGHT_CLIMBER_MOTOR_ID = 14;

    public static final int INTAKE_MOTOR_ID = 2;
    public static final int RIGHT_INTAKE_CENTERING_MOTOR_ID = 4;
    public static final int LEFT_INTAKE_CENTERING_MOTOR_ID = 5;

    public static final int INDEXER_MOTOR_ID = 6;

    public static final int SHOOTER_TOP_MOTOR_ID = 8;
    public static final int SHOOTER_BOTTOM_MOTOR_ID = 7;

    public static final int ARM_LEFT_MOTOR_ID = 9;
    public static final int ARM_RIGHT_MOTOR_ID = 10;

    public static final int FRONT_LEFT_DRIVE_CAN_ID = 11;
    public static final int REAR_LEFT_DRIVE_CAN_ID = 21;
    public static final int FRONT_RIGHT_DRIVE_CAN_ID = 31;
    public static final int REAR_RIGHT_DRIVE_CAN_ID = 38;

    public static final int FRONT_LEFT_STEER_CAN_ID = 12;
    public static final int REAR_LEFT_STEER_CAN_ID = 22;
    public static final int FRONT_RIGHT_STEER_CAN_ID = 32;
    public static final int REAR_RIGHT_STEER_CAN_ID = 39;
  }
}
