package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.hardware.hardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "FTC Competition (Blocks to Java)")
public class Competition24_25 extends LinearOpMode {

  private DcMotor frontRight;
  private DcMotor backRight;
  private DcMotor frontLeft;
  private DcMotor backLeft;

  public void runOpMode() {
    float horizontal;
    float vertical;
    float pivot;
    float armDown;
    float armUp;

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
        // Put run blocks here.
        horizontal = gamepad1.right_stick_x;
        vertical = gamepad1.right_stick_y;
        pivot = -gamepad1.left_stick_x;
        frontRight.setPower(-pivot + (vertical - horizontal));
        backRight.setPower(-pivot + vertical + horizontal);
        frontLeft.setPower(pivot + vertical + horizontal);
        backLeft.setPower(pivot + (vertical - horizontal));
        telemetry.addData("key", 123);        
      }
    }
  }
}
