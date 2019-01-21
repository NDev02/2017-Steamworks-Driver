
package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Controller {

    private Joystick joy;

    public Controller() {
        joy = new Joystick(0);
    }

    public double getForward() {
        return -joy.getRawAxis(4) + 1;
    }

    public double getBackward() {
        return -joy.getRawAxis(3) + 1;
    }

    public double getSide() {
        return -joy.getRawAxis(0);
    }

    public double getRotation() {
        return -joy.getRawAxis(2);
    }

}