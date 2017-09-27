package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class DriveTrain1 extends OpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;
    double rightWheelPower;
    double leftWheelPower;
    double lsx1;
    double lsx2;
    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("left_wheel");
        rightMotor = hardwareMap.dcMotor.get("right_wheel");
        leftWheelPower = 0;
        rightWheelPower = 0;

        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void start(){

    }


    @Override
    public void loop() {
        //Driver
        lsx1 = -gamepad1.left_stick_x;
        lsx2 = -gamepad2.left_stick_x;


        leftMotor.setPower(lsx1);
        rightMotor.setPower(lsx2);
    }

    @Override
    public void stop(){

    }

}