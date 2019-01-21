
package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class DriveTrain 
{
	private MecanumDrive drive;
	private WPI_TalonSRX frontLeft, rearLeft, frontRight, rearRight;

	public DriveTrain() 
	{
		frontLeft = new WPI_TalonSRX(Wiring.FRONT_LEFT_MOTOR);
		rearLeft = new WPI_TalonSRX(Wiring.REAR_LEFT_MOTOR);
		frontRight = new WPI_TalonSRX(Wiring.FRONT_RIGHT_MOTOR);
		rearRight = new WPI_TalonSRX(Wiring.REAR_RIGHT_MOTOR);

		frontLeft.set(ControlMode.Velocity, 0);
		rearLeft.set(ControlMode.Velocity, 0);
		frontRight.set(ControlMode.Velocity, 0);
		rearRight.set(ControlMode.Velocity, 0);

		drive = new MecanumDrive(frontLeft, rearLeft, frontRight, rearRight);
	}

	public void driveCartesian(double ySpeed, double xSpeed, double zRotation) 
	{
		drive.driveCartesian(ySpeed, xSpeed, zRotation);
	}
}
