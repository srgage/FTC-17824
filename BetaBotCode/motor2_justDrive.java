package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name = "JustDrive 2 Motor (Blocks to Java)")

public class motor2_justDrive extends LinearOpMode {

    // todo: write your code here
  private DcMotor right;
  private DcMotor left;
  
  public void runOpMode() {
    right = hardwareMap.get(DcMotor.class, "right");
    left = hardwareMap.get(DcMotor.class, "left");
    ControlHub_ServoController = hardwareMap.get(ServoController.class, "Control Hub");
    test = hardwareMap.get(Servo.class, "test");

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
      }
    }
  }
}
