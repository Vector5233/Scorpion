package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name = "ScorpionTeleOp" , group = "robot")
public class ScorpionTeleOp extends OpMode {
    DcMotor shoulderLeft, shoulderRight, elbowOne, elbowTwo;
    Stinger stinger;

    public void init() {
        stinger = new Stinger(this);
        stinger.init();

    }

    public void loop(){
        stinger.ticksToDegreesTest();
    }
}
