package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.checkerframework.checker.units.qual.C;
import org.firstinspires.ftc.teamcode.subsystems.CameraSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.ClawSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.DrivebaseSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.LiftSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.SpinnerSubsystem;

public class Robot {

    public HardwareMap hwMap = null;

    public double triggerDeadzone = .3;

    public SpinnerSubsystem spinner = new SpinnerSubsystem();
    public LiftSubsystem lift = new LiftSubsystem();
    public DrivebaseSubsystem drivebase = new DrivebaseSubsystem();
    public ClawSubsystem claw = new ClawSubsystem();
    public CameraSubsystem camera = new CameraSubsystem();

    public enum coneStates{
        NONE,
        READYFORPICKUP,
        GRABBED
    }

    public coneStates activeConeState = coneStates.NONE;

    public Robot() {

    }

   public void init(HardwareMap ahwMap) {

        hwMap = ahwMap;

        spinner.initSpinner(hwMap);
        lift.initLift(hwMap);
        drivebase.initDrivebase(hwMap);
        claw.initClaw(hwMap);
        camera.initCamera(hwMap);

    }
}
