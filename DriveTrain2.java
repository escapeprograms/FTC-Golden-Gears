package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class DriveTrain2 extends OpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;
    //Servo clawGrabber;
    //Servo clawElevator;
    double rightWheelPower;
    double leftWheelPower;
    double lsx1;
    double lsy1;
    double lsx2;
    double lsy2;
    //double clawSize;
    //double clawElevation;
    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("left_wheel");
        rightMotor = hardwareMap.dcMotor.get("right_wheel");
        leftWheelPower = 0;
        rightWheelPower = 0;


        //clawGrabber = hardwareMap.servo.get("claw");
        //clawElevator = hardwareMap.servo.get("elevator");
        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void start(){

    }


    @Override
    public void loop() {
        //Driver
        lsx1 = -gamepad1.left_stick_x;
        lsy1 = -gamepad1.left_stick_y;
        if (lsx1 > 0) {
            leftWheelPower = lsx1;
            rightWheelPower = -lsx1;
        }
        else if (lsx1 < 0){
            leftWheelPower = -lsx1;
            rightWheelPower = lsx1;
        }
        if (lsy1 > 0){
            leftWheelPower = lsy1;
        }
        else if (lsy1 < 0){
            leftWheelPower = -lsy1;
            rightWheelPower = -lsy1;
        }
        leftMotor.setPower(leftWheelPower);
        rightMotor.setPower(rightWheelPower);
        //Claw elevation
        lsx2 = gamepad2.left_stick_x;
        lsy2 = gamepad2.left_stick_y;
        if (lsx2 > 0){

        }
        else if (lsx2 < 0){

        }
        
    }

    @Override
    public void stop(){

    }

}