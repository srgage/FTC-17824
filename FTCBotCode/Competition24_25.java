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
  private DcMotor lift;
  private DcMotor shoulder;

  public void runOpMode() {
    //Drive
    float horizontal;
    float vertical;
    float pivot;
    double drivePower = 0.5;
    //Arm
    double liftPower = 0.5;
    double shoulderPower = 0.5;
    double elbowPower = 0.5;

    //drive
    frontRight = hardwareMap.get(DcMotor.class, "frontRight");
    backRight = hardwareMap.get(DcMotor.class, "backRight");
    frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
    backLeft = hardwareMap.get(DcMotor.class, "backLeft");
    //arm
    ControlHub_ServoController = hardwareMap.get(ServoController.class, "Control Hub");
    pincher = hardwareMap.get(Servo.class, "pincher");
    wrist = hardwareMap.get(Servo.class, "wrist");
    elbow = hardwareMap.get(DcMotor.class, "elbow");
    lift = hardwareMap.get(DcMotor.class, "lift");
    shoulder = hardwareMap.get(DcMotor.class, "shoulder");

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
        //If the left bumper is pressed, the lift moves down. If the right bumper is pressed, the lift moves up.
        if (gamepad1.left_bumper) {
          //down
          lift.setPower(-liftPower);
        }
        else if (gamepad1.right_bumper) {
          //up
          lift.setPower(liftPower);
        }
        else {
          lift.setPower(0);
        }

        //Shoulder - Motor
        //The left trigger moves the shoulder in, the right trigger moves the shoulder out
        shoulder.setPower((gamepad1.left_trigger - gamepad1.right_trigger) * shoulderPower);

        //Elbow - Motor
        //Right moves the arm out, left moves the arm in
       if (gamepad1.dpad_left) {
          elbow.setPower(-elbowPower);
        }
        else if (gamepad1.dpad_right) {
          elbow.setPower(elbowPower);
        }
        else {
          elbow.setPower(0);
        }

        //Wrist - Servo
        //Would like to test under one button with a wrist position variable
        //Button A moves the wrist (position 1 = up, position 0 = down)
        if (gamepad1.a) {
          wrist.setPosition(1);
        }
        else if (gamepad1.y) {
          wrist.setPosition(0);
        }

        //Pincher - Servo
        //Would like to test under one button with a pincher position variable
        //Button Y moves the pincher  (position 1 = close, position 0 = open)
        if (gamepad1.x) {
          pincher.setPosition(1);
        }
        else if (gamepad1.b) {
          pincher.setPosition(0);
        }
      }
    }
  }
}
