package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class Stinger {
    DcMotor shoulderLeft, shoulderRight, bottomElbow, topElbow;
    OpMode parent;
    public Stinger(OpMode p) {
        parent = p;
    }

    public void init() {
        shoulderLeft = parent.hardwareMap.dcMotor.get("shoulderLeft");
        shoulderRight = parent.hardwareMap.dcMotor.get("shoulderRight");
        bottomElbow = parent.hardwareMap.dcMotor.get("bottomElbow");
        topElbow = parent.hardwareMap.dcMotor.get("topElbow");

        shoulderLeft.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        shoulderLeft.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);

        shoulderRight.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        shoulderRight.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);

        bottomElbow.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        bottomElbow.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);

        topElbow.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        topElbow.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
    }

}
