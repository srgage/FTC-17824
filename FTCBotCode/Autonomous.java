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

  //Set positions for auto
  private int leftPos;
  private int RightPos;

  public void runOpMode() {
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
    
    waitForStart();

    //forward
    drive(100, 100, drivePower);

    //turn
    drive(100, -100, drivePower);
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
}
