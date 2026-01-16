package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;
import com.qualcomm.robotcore.hardware.HardwareMap;


@TeleOp(name = "FTC Competition (Blocks to Java)")
public class Competition25_26 extends LinearOpMode {
  //Drive
  private DcMotor frontRight;
  private DcMotor backRight;
  private DcMotor frontLeft;
  private DcMotor backLeft;

  //Shooter
  private DcMotor storage;
  private DcMotor shooter;

  public void runOpMode() {
    //Drive
    float horizontal;
    float vertical;
    float pivot;
    double drivePower = 0.5;
    //Shooter
    double storagePower = 0.25;
    double shooterPower = 0.25;

    //drive
    frontRight = hardwareMap.get(DcMotor.class, "frontRight");
    backRight = hardwareMap.get(DcMotor.class, "backRight");
    frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
    backLeft = hardwareMap.get(DcMotor.class, "backLeft");
    //shooter
    storage = hardwareMap.get(DcMotor.class, "storage");
    shooter = hardwareMap.get(DcMotor.class, "shooter");

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
        
        //Storage - Motor
        //If the a button is pressed, the storage flywheels take in. 
        if (gamepad1.b) {
          //down
          storage.setPower(liftPower);
        }
        else {
          storage.setPower(0);
        }

        //Shoot - Motor
        //If the a button is press, the shooter flywheels shoot.
       if (gamepad1.a) {
          shooter.setPower(elbowPower);
        }
        else {
          shooter.setPower(0);
        }
      }
    }
  }
}
