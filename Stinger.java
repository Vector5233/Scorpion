package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class Stinger {
    DcMotor shoulderLeft, shoulderRight, elbowOne, elbowTwo;
    OpMode parent;
    public Stinger(OpMode p) {
        parent = p;
    }

    public void init() {
        shoulderLeft = parent.hardwareMap.dcMotor.get("shoulderLeft");
        shoulderRight = parent.hardwareMap.dcMotor.get("shoulderRight");
        elbowOne = parent.hardwareMap.dcMotor.get("elbowOne");
        elbowTwo = parent.hardwareMap.dcMotor.get("elbowTwo");

        shoulderLeft.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        shoulderLeft.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);

        shoulderRight.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        shoulderRight.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);

        elbowOne.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        elbowOne.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);

        elbowTwo.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        elbowTwo.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
    }

}
