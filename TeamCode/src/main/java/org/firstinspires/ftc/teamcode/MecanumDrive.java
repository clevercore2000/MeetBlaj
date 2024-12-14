package org.firstinspires.ftc.teamcode;

public class MecanumDrive {
    public Hardware hardware;
    public MecanumDrive(Hardware hardware){

        this.hardware = hardware;

    }


    public void drive(double x, double y, double rx){


        double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
        double frontLeftPower = (y + x + rx) / denominator;
        double backLeftPower = (y - x + rx) / denominator;
        double frontRightPower = (y - x - rx) / denominator;
        double backRightPower = (y + x - rx) / denominator;

        hardware.leftFront.setPower(frontLeftPower);
        hardware.leftBack.setPower(backLeftPower);
        hardware.rightFront.setPower(frontRightPower);
        hardware.rightBack.setPower(backRightPower);

    }



}
