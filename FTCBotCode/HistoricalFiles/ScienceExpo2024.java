package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name = "ScienceExpo2024 (Blocks to Java)")

public class ScienceExpo2024 extends LinearOpMode {

    // todo: write your code here
  private DcMotor right;
  private DcMotor left;
  private ServoController ControlHub_ServoController;
  //private Servo arm;
  //private DcMotor vertical;
  private Servo airplane1;
  private Servo airplane2;
  
  public void runOpMode() {
    right = hardwareMap.get(DcMotor.class, "right");
    left = hardwareMap.get(DcMotor.class, "left");
    ControlHub_ServoController = hardwareMap.get(ServoController.class, "Control Hub");
    //arm = hardwareMap.get(Servo.class, "arm");
    //vertical = hardwareMap.get(DcMotor.class, "vertical");
    airplane1 = hardwareMap.get(Servo.class, "airplane1");
    airplane2 = hardwareMap.get(Servo.class, "airplane2");
    
    
    // Put initialization blocks here.
    telemetry.addData("kkey", 1234);
    telemetry.update();
    right.setDirection(DcMotorSimple.Direction.REVERSE);
    
    waitForStart();
    if (opModeIsActive()) {
      telemetry.addData("key", 321);
      telemetry.update();
      while (opModeIsActive()) {
        // Put run blocks here.
        double power = 0.5;
        if (gamepad1.dpad_up) {
          right.setPower(-power);
          left.setPower(-power);
        }
        if (gamepad1.dpad_down) {
          right.setPower(power);
          left.setPower(power);
        }
        if (gamepad1.dpad_right) {
          right.setPower(0);
          left.setPower(-power);
        }
        if (gamepad1.dpad_left) {
          right.setPower(-power);
          left.setPower(0);
        }
        if (gamepad1.right_bumper) {
          right.setPower(0);
          left.setPower(0);
        }
        
        // if (gamepad1.a) {
        //   arm.setPosition(0.3);
        // }
        // if (gamepad1.y) {
        //   arm.setPosition(0.7);
        // }
        
        // if (gamepad1.right_bumper) {
        //   vertical.setPower(0.5);
        // }
        // if (gamepad1.left_bumper) {
        //   vertical.setPower(-0.5);
        // }
        // if (gamepad1.b) {
        //   vertical.setPower(0);
        // }
        
        //airplane1 - servo1
        if (gamepad1.y) {
          airplane1.setPosition(0);
        }
        if (gamepad1.a) {
          airplane1.setPosition(1);
        }
        //airplane2 - servo2
        if (gamepad1.x) {
          airplane2.setPosition(0);
        }
        if (gamepad1.b) {
          airplane2.setPosition(1);
        }
      }
    }
  }
}
