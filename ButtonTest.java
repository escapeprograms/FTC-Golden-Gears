package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * By Arky Li
 */

public class ButtonTest extends OpMode {
    DcMotor motor;
    @Override
    public void init() {
        motor = hardwareMap.dcMotor.get("");
    }

    @Override
    public void start(){

    }


    @Override
    public void loop() {
    if (gamepad1.a){
        motor.setPower(1);
    }
    }

    @Override
    public void stop(){

    }

}