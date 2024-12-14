package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class AutonomousBlue extends LinearOpMode {


    Hardware hardware;
    @Override
    public void runOpMode() throws InterruptedException {

        hardware = new Hardware(hardwareMap);

        waitForStart();
        while (opModeIsActive()) {

           hardware.rightFront.setPower(0.2);
            hardware.leftFront.setPower(0.2);
            hardware.rightBack.setPower(0.2);
            hardware.leftBack.setPower(0.2);
            try{Thread.sleep(5000);} catch (InterruptedException e){}
            hardware.rightFront.setPower(0);
            hardware.leftFront.setPower(0);
            hardware.rightBack.setPower(0);
            hardware.leftBack.setPower(0);

        }
    }
}
