
package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
  private DriveTrain drive;
  private Controller controller;

  @Override
  public void robotInit() {
    drive = new DriveTrain();
    controller = new Controller();
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void teleopPeriodic() {//controller.getForward() - controller.getBackward()
    drive.driveCartesian(controller.getSide(), controller.getForward() - controller.getBackward(), controller.getRotation());
  }
}
