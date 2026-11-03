package frc.robot.subsystems;

import org.wpilib.telemetry.Telemetry;

public class Shooter {

    public static boolean shooterRunning = false;
    public Shooter()
    {
            shooterRunning = false;
    }

    public void run()
    {
        Telemetry.log("Shooter/Shooter Running", shooterRunning);
    }

    public void setRunning()
    {
        shooterRunning = true;
    }
    public void setStopped()
    {
        shooterRunning = false;
    }
    
}
