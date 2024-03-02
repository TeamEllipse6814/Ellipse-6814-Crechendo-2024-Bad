// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OIConstants {
    public static final int kDriverControllerPort = 0;
  }
  
  public static class ShooterConstants {
    //motors assume that a negative value is clockwise direction,
    //so values should generally be negative
    public static final double kShooterIntakeSpeed = 0.0;
    public static final double kShooterSourceSpeed = 0.2;
    public static final double kShooterSpeakerAmpSpeed = 0.3;

    public static final int kBeamBreaker1Port = 8;
    public static final int kBeamBreaker2Port = 9;
    
    public static final int kMotor1Port = 11;
    public static final int kMotor2Port = 9;
    public static final int kMotor3Port = 13;
    public static final int kIntakeMotorPort = 0;

    //clockwise is positive:
    public static final boolean kMotor1Inverted = false;
    public static final boolean kMotor2Inverted = false;
    public static final boolean kMotor3Inverted = false;
    public static final boolean kIntakeMotorInverted = false;
  }

  public static class ClimbConstants
  {
    public static final int kRightMotorPort = 0;
    public static final int kLeftMotorPort = 0;

    public static final double kp = 0.0;
    public static final double ki = 0.0;
    public static final double kd = 0.0;
    public static final double encoderTicks2Meters = 0.0;
  }

  public static class ArmConstants
  {
    public static final int kArmMotor1Port = 0;
    public static final int kArmMotor2Port = 0;

    public static final double kp = 0.0;
    public static final double ki = 0.0;
    public static final double kd = 0.0;

    //feedforward stuff
    public static final double ks = 0.0;
    public static final double kg = 0.0;
    public static final double kv = 0.0;
    public static final double kMaxVelocity = 0.0; //eli said this was max velocity idk

    public static final double kEncoderTicks2Radians = 0.0;

    //Change the influence of the PID controller and Feedforward controller
    //ex. pidInfluence = 0.0; feedforwardInfluence = 1.0;   means 100% feedforward (pid is not used)
    //    pidInfluence = 0.5; feedforwardInfluence = 0.5;   means half and half
    public static final double kPIDInfluence = 0.0;
    public static final double kFeedforwardInfluence = 0.0;
  }
  
  public static final class ModuleConstants {
        public static final double kWheelDiameterMeters = Units.inchesToMeters(3.75);  
        public static final double kDriveMotorGearRatio = 1 / 6.75;
        public static final double kTurningMotorGearRatio = 1 / (150.0/7);
        public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;
        public static final double kTurningEncoderRot2Rad = kTurningMotorGearRatio * 2 * Math.PI;
        public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
        public static final double kTurningEncoderRPM2RadPerSec = kTurningEncoderRot2Rad / 60;
        public static final double kPTurning = 0.5;
    }

  public static final class DriveConstants {

        public static final double kTrackWidth = edu.wpi.first.math.util.Units.inchesToMeters(25.125);
        // Distance between right and left wheels
        public static final double kWheelBase = edu.wpi.first.math.util.Units.inchesToMeters(29);
        // Distance between front and back wheels
        public static final edu.wpi.first.math.kinematics.SwerveDriveKinematics kDriveKinematics = new edu.wpi.first.math.kinematics.SwerveDriveKinematics(
                new edu.wpi.first.math.geometry.Translation2d(kWheelBase / 2, -kTrackWidth / 2),
                new edu.wpi.first.math.geometry.Translation2d(kWheelBase / 2, kTrackWidth / 2),
                new edu.wpi.first.math.geometry.Translation2d(-kWheelBase / 2, -kTrackWidth / 2),
                new edu.wpi.first.math.geometry.Translation2d(-kWheelBase / 2, kTrackWidth / 2));

        public static final int kFrontLeftDriveMotorPort = 6; //mod0
        public static final int kBackLeftDriveMotorPort = 4;//mod1
        public static final int kFrontRightDriveMotorPort = 8; //mod2
        public static final int kBackRightDriveMotorPort = 2;//mod3

        public static final int kFrontLeftTurningMotorPort = 5;//mod0
        public static final int kBackLeftTurningMotorPort = 3;//mod1
        public static final int kFrontRightTurningMotorPort = 7; //mod2
        public static final int kBackRightTurningMotorPort = 1;//mod3

        public static final boolean kFrontLeftTurningEncoderReversed = false;
        public static final boolean kBackLeftTurningEncoderReversed = false;
        public static final boolean kFrontRightTurningEncoderReversed = false;
        public static final boolean kBackRightTurningEncoderReversed = false;

        public static final boolean kFrontLeftDriveEncoderReversed = true;
        public static final boolean kBackLeftDriveEncoderReversed = true;
        public static final boolean kFrontRightDriveEncoderReversed = false;
        public static final boolean kBackRightDriveEncoderReversed = false;

        public static final int kFrontLeftDriveAbsoluteEncoderPort = 0;
        public static final int kBackLeftDriveAbsoluteEncoderPort = 3;
        public static final int kFrontRightDriveAbsoluteEncoderPort = 1;
        public static final int kBackRightDriveAbsoluteEncoderPort = 2;

        public static final boolean kFrontLeftDriveAbsoluteEncoderReversed = true;
        public static final boolean kBackLeftDriveAbsoluteEncoderReversed = true;
        public static final boolean kFrontRightDriveAbsoluteEncoderReversed = true;
        public static final boolean kBackRightDriveAbsoluteEncoderReversed = true;

        public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = 1.254; //module 0
        public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = 5.063; //module 3
        public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = 1.280; //module 1
        public static final double kBackRightDriveAbsoluteEncoderOffsetRad = 3.822; //module 2

        public static final double kPhysicalMaxSpeedMetersPerSecond = 4;
        public static final double kPhysicalMaxAngularSpeedRadiansPerSecond = 2 * 2 * Math.PI;

        public static final double kTeleDriveMaxSpeedMetersPerSecond = kPhysicalMaxSpeedMetersPerSecond / 2;
        public static final double kTeleDriveMaxAngularSpeedRadiansPerSecond = //
                kPhysicalMaxAngularSpeedRadiansPerSecond / 5;
        public static final double kTeleDriveMaxAccelerationUnitsPerSecond = 3;
        public static final double kTeleDriveMaxAngularAccelerationUnitsPerSecond = 3;
    }

    public static final class AutoConstants {
        public static final double kMaxSpeedMetersPerSecond = DriveConstants.kPhysicalMaxSpeedMetersPerSecond / 4;
        public static final double kMaxAngularSpeedRadiansPerSecond = //
                DriveConstants.kPhysicalMaxAngularSpeedRadiansPerSecond / 10;
        public static final double kMaxAccelerationMetersPerSecondSquared = 3;
        public static final double kMaxAngularAccelerationRadiansPerSecondSquared = Math.PI / 4;
        public static final double kPXController = 1.5;
        public static final double kPYController = 1.5;
        public static final double kPThetaController = 3;

        public static final TrapezoidProfile.Constraints kThetaControllerConstraints = //
                new TrapezoidProfile.Constraints(
                        kMaxAngularSpeedRadiansPerSecond,
                        kMaxAngularAccelerationRadiansPerSecondSquared);
    }
}
