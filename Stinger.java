package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class Stinger extends OpMode {
    DcMotor shoulderLeft, shoulderRight, elbowOne, elbowTwo;
    public void init() {
        shoulderLeft = hardwareMap.dcMotor.get("shoulderLeft");
        shoulderRight = hardwareMap.dcMotor.get("shoulderRight");
        elbowOne = hardwareMap.dcMotor.get("elbowOne");
        elbowTwo = hardwareMap.dcMotor.get("elbowTwo");

        shoulderLeft.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        shoulderLeft.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);

        shoulderRight.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        shoulderRight.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);

        elbowOne.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        elbowOne.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);

        elbowTwo.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        elbowTwo.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
    }
    public void loop(){

    }
}
