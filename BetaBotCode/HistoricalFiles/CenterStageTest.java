package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name = "CenterStageTest (Blocks to Java)")

public class CenterStageTest extends LinearOpMode {

    // todo: write your code here
  private ServoController ControlHub_ServoController;
  //private ServoController ControlHub_ServoController;
  //public Servo launcher;
  //private Servo extra;
  private DcMotor frontRight;
  private DcMotor backRight;
  private DcMotor frontLeft;
  private DcMotor backLeft;
  private DcMotor arm;
  private DcMotor pincers;
  //private DcMotor hanging;
  private Servo scoop;
  private Servo airplane;
  
  public void runOpMode() {
    float horizontal;
    float vertical;
    float pivot;
    float armDown;
    float armUp;
    float armDown1;
    float armUp1;

    frontRight = hardwareMap.get(DcMotor.class, "frontRight");
    backRight = hardwareMap.get(DcMotor.class, "backRight");
    frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
    backLeft = hardwareMap.get(DcMotor.class, "backLeft");
    arm = hardwareMap.get(DcMotor.class, "arm");
    //hanging = hardwareMap.get(DcMotor.class, "hanging");
    ControlHub_ServoController = hardwareMap.get(ServoController.class, "Control Hub");
    //launcher = hardwareMap.get(Servo.class, "launcher");
    //extra = hardwareMap.get(Servo.class, "extra");
    pincers = hardwareMap.get(DcMotor.class, "pincers");
    scoop = hardwareMap.get(Servo.class, "scoop");
    airplane = hardwareMap.get(Servo.class, "airplane");

    // Put initialization blocks here.
    telemetry.addData("kkey", 1234);
    telemetry.update();
    frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
    backRight.setDirection(DcMotorSimple.Direction.REVERSE);
    //arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    waitForStart();
    if (opModeIsActive()) {
      ControlHub_ServoController.pwmEnable();
      telemetry.addData("key", 321);
      telemetry.update();
      while (opModeIsActive()) {
        // Put run blocks here.
        horizontal = gamepad1.right_stick_x;
        vertical = gamepad1.right_stick_y;
        pivot = -gamepad1.left_stick_x;
        double percentpower = 0.5;
        frontRight.setPower((-pivot + (vertical - horizontal))*percentpower);
        backRight.setPower((-pivot + vertical + horizontal)*percentpower);
        frontLeft.setPower((pivot + vertical + horizontal)*percentpower);
        backLeft.setPower((pivot + (vertical - horizontal))*percentpower);
        telemetry.addData("piv", pivot);
        telemetry.addData("ver", vertical);
        telemetry.addData("hor", horizontal);
        
        //up - motor
        if (gamepad1.right_bumper) {
          arm.setPower(5);
        }
        if (gamepad1.left_bumper) {
          arm.setPower(-5);
        }
        
        //hanging arm - motor
        // if (gamepad1.dpad_right) {
        //   hanging.setPower(5);
        // }
        // if (gamepad1.dpad_left) {
        //   hanging.setPower(-5);
        // }
        
        //scoop - servo
        if (gamepad1.x) {
          scoop.setPosition(0);
        }
        if (gamepad1.b) {
          scoop.setPosition(0.6);
        }
        
        //airplane - servo
        // if (gamepad1.y) {
        //   airplane.setPosition(0);
        // }
        // if (gamepad1.a) {
        //   airplane.setPosition(1);
        // }
        
        
        //arm - motor
        armDown = gamepad1.right_trigger;
        armUp = gamepad1.left_trigger;
        
        telemetry.addData("down", armDown);
        telemetry.addData("up", armUp);
        pincers.setPower(armUp + -armDown);
        
        //need to test - sarah
        // if (gamepad1.x) {
        //   launcher.setPosition(0);
        // }
        
        // if (gamepad1.y) {
        //   extra.setPosition(0);
        // }
        // if (gamepad1.b) {
        //   extra.setPosition(1);
        // }
        
        // Put loop blocks here.
        // telemetry.update();
        // ControlHub_ServoController.pwmEnable();
        // if (gamepad1.dpad_down) {
        //   servo.setPosition(0.35);
        // }
        // if (gamepad1.dpad_up) {
        //   servo.setPosition(-0.5);
        // }
        // if (gamepad1.right_bumper) {
        //   liftMotor.setPower(0.5);
        // }
        // if (gamepad1.left_bumper) {
        //   liftMotor.setPower(-0.5);
        // }
        // if (gamepad1.b) {
        //   liftMotor.setPower(0);
        // }
      }
    }
  }
}
