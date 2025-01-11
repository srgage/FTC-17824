package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "Auto Test")
public class Autonomous extends LinearOpMode {

  //Define drive motors
  private DcMotor frontRight;
  private DcMotor backRight;
  private DcMotor frontLeft;
  private DcMotor backLeft;

  //Define arm motors and servos
  private ServoController ControlHub_ServoController;
  private Servo pincher;
  private Servo wrist;
  private DcMotor elbow;
  private DcMotor lift;
  private DcMotor shoulder;

  //Set positions for auto
  private int leftPos;
  private int RightPos;
  private int liftPos;

  public void runOpMode() {
    //drive
    double drivePower = 0.25;

    frontRight = hardwareMap.get(DcMotor.class, "frontRight");
    backRight = hardwareMap.get(DcMotor.class, "backRight");
    frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
    backLeft = hardwareMap.get(DcMotor.class, "backLeft");

    frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    leftPos = 0;
    rightPos = 0;

    telemetry.addData("kkey", 1234);
    telemetry.update();
    frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
    backRight.setDirection(DcMotorSimple.Direction.REVERSE);

    //arm
    double elbowPower = 0.25;
    double liftPower = 0.25;
    double shoulderPower = 0.25;
    elbow = hardwareMap.get(DcMotor.class, "elbow");
    lift = hardwareMap.get(DcMotor.class, "lift");
    shoulder = hardwareMap.get(DcMotor.class, "shoulder");
    elbow.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    lift.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    shoulder.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    elbowPos = 0;
    liftPos = 0;
    shoulderPos = 0;

    waitForStart();

    //Examples
    /*
    //forward
    drive(100, 100, drivePower);
    //turn
    drive(100, -100, drivePower);
    //lift
    liftMove(100, liftPower);
    //elbow
    elbowMove(100, elbowPower);
    //shoulder
    shoulderMove(100, shoulderPower);
    //pincher
    pincher.setPosition(1);
    //wrist
    wrist.setPosition(1);
    */
  }
  
  private void drive(int leftTarget, int rightTarget, double speed) {
    leftPos += leftTarget;
    rightPos += rightTarget;

    frontRight.setTargetPosition(rightPos);
    backRight.setTargetPosition(rightPos);
    frontLeft.setTargetPosition(leftPos);
    backLeft.setTargetPosition(leftPos);

    frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    frontRight.setPower(speed);
    backRight.setPower(speed);
    frontLeft.setPower(speed);
    backLeft.setPower(speed);

    while(opModeIsActive() && frontRight.isBusy() && backRight.isBusy() && frontLeft.isBusy() && backLeft.isBusy()) {
      idle();
    }
  }

  private void liftMove(int target, double speed) {
    liftPos += target;
    lift.setTargetPosition(liftPos);
    lift.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    lift.setPower(speed);

    while(opModeIsActive() && lift.isBusy()) {
      idle();
    }
  }

  private void elbowMove(int target, double speed) {
    elbowPos += target;
    elbow.setTargetPosition(elbowPos);
    elbow.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    elbow.setPower(speed);

    while(opModeIsActive() && elbow.isBusy()) {
      idle();
    }
  }

  private void shoulderMove(int target, double speed) {
    shoulderPos += target;
    shoulder.setTargetPosition(shoulderPos);
    shoulder.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    shoulder.setPower(speed);

    while(opModeIsActive() && shoulder.isBusy()) {
      idle();
    }
  }
}
