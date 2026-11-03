package frc.robot.subsystems;

import org.wpilib.telemetry.Telemetry;

public class Intake {

    public static boolean intakeRunning = false;
    public Intake()
    {
            intakeRunning = false;
    }

    public void run()
    {
        Telemetry.log("Intake/Intake Running", intakeRunning);
    }

    public void setRunning()
    {
        intakeRunning = true;
    }
    public void setStopped()
    {
        intakeRunning = false;
    }
    
}
