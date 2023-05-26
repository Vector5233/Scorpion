package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.MotionDetection;

import java.util.Vector;

public class Stinger {
    DcMotor shoulderLeft, shoulderRight, bottomElbow, topElbow;
    double bottom, middle, top;
    bottom =
    middle =
    top =
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

    public int getTickPosition(DcMotor whichMotor){
        return whichMotor.getCurrentPosition();
    }

    public double convertTicksToDegrees (DcMotor whichMotor) {
        double motorTicks;
        double startAngle:

        if (whichMotor == bottomElbow) {
            motorTicks = 1425.1;
            startAngle = 140;

        } else if (whichMotor == topElbow){
            motorTicks = 751.8;
            startAngle = -140;
        } else {
            motorTicks = 751.8;
            startAngle = 0;
        }

        return ((getTickPosition(whichMotor)/motorTicks*360)+startAngle);
    }

    public void goToAngle (double angle){
    }

    /*public double convertDegreesToTicks (double degrees){

    }

    public Vector calculateFinalPosition (){

    }*/

    public void goToFinalPosition(Vector finalPosition){

    }

    /*void getTicksTest() {
        parent.telemetry.addData("Left Shoulder", getTickPosition(shoulderLeft));
        parent.telemetry.addData("Right Shoulder", getTickPosition(shoulderRight));
        parent.telemetry.addData("Bottom Elbow", getTickPosition(bottomElbow));
        parent.telemetry.addData("Top Elbow", getTickPosition(topElbow));
        return;
    }*/

    void ticksToDegreesTest() {
        parent.telemetry.addData("Left Shoulder", convertTicksToDegrees(shoulderLeft));
        parent.telemetry.addData("Right Shoulder", convertTicksToDegrees(shoulderRight));
        parent.telemetry.addData("Bottom Elbow", convertTicksToDegrees(bottomElbow));
        parent.telemetry.addData("Top Elbow", convertTicksToDegrees(topElbow));
        return;
    }

    public double convertPolarToRectangular(double angle){

    }

}
