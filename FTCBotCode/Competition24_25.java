package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;
import com.qualcomm.robotcore.hardware.HardwareMap;


@TeleOp(name = "FTC Competition (Blocks to Java)")
public class Competition24_25 extends LinearOpMode {
  //Drive
  private DcMotor frontRight;
  private DcMotor backRight;
  private DcMotor frontLeft;
  private DcMotor backLeft;

  //Arm
  private ServoController ControlHub_ServoController;
  private Servo pincher;
  private Servo wrist;
  private DcMotor elbow;
  private DcMotor lift
  private DcMotor shoulder

  public void runOpMode() {
    //Drive
    float horizontal;
    float vertical;
    float pivot;
    double drivePower = 1;

    //Arm
    double liftPower = 1;
    double shoulderPower = 1;
    double elbowPower = 1;

    frontRight = hardwareMap.get(DcMotor.class, "frontRight");
    backRight = hardwareMap.get(DcMotor.class, "backRight");
    frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
    backLeft = hardwareMap.get(DcMotor.class, "backLeft");

    // Put initialization blocks here.
    telemetry.addData("kkey", 1234);
    telemetry.update();
    frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
    backRight.setDirection(DcMotorSimple.Direction.REVERSE);
    waitForStart();
    if (opModeIsActive()) {
      telemetry.addData("key", 321);
      telemetry.update();
      while (opModeIsActive()) {
        //Drive
        horizontal = gamepad1.right_stick_x;
        vertical = gamepad1.right_stick_y;
        pivot = -gamepad1.left_stick_x;
        frontRight.setPower((-pivot + (vertical - horizontal)) * drivePower);
        backRight.setPower((-pivot + (vertical + horizontal)) * drivePower);
        frontLeft.setPower((pivot + (vertical + horizontal)) * drivePower);
        backLeft.setPower((pivot + (vertical - horizontal)) * drivePower);
        telemetry.addData("key", 123);


        
        //Arm
        //Lift - Motor
        if !gamepad1.left_bumper && !gamepad1.right_bumper {
          list.setPower(0);
        }
        else if gamepad1.left_bumper {
          //down
          lift.setPower(-liftPower);
        }
        else if gamepad1.right_bumper {
          //up
          lift.setPower(liftPower);
        }
        else {
          lift.setPower(0);
        }

        //Shoulder - Motor
        shoulder.setPower((left_trigger - right_trigger) * shoulderPower);

        //Elbow - Motor
        //right arm out and left arm in
        if !gamepad1.dpad_left && !gamepad1.dpad_right {
          elbow.setPower(0);
        }
        else if gamepad1.dpad_left {
          elbow.setPower(-elbowPower);
        }
        else if gamepad1.dpad_right {
          elbow.setPower(elbowPower);
        }
        else {
          elbow.setPower(0);
        }

        //Wrist - Servo
        //Would like to test under one button with a wrist position variable
        if gamepad1.a {
          wrist.setPosition(1);
        }
        if gamepad1.x {
          wrist.setPosition(0);
        }

        //Pincher - Servo
        //Would like to test under one button with a pincher position variable
        if gamepad1.y {
          pincher.setPosition(1);
        }
        if gamepad1.b {
          pincher.setPosition(0);
        }
        
      }
    }
  }
}
