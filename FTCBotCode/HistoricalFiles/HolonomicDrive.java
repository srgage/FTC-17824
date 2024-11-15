// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.DcMotorSimple;

// @TeleOp(name = "HolonomicDrive (Blocks to Java)")
// public class HolonomicDrive extends LinearOpMode {


//   private DcMotor frontRight;
//   private DcMotor backRight;
//   private DcMotor frontLeft;
//   private DcMotor backLeft;

//   /**
//   * This function is executed when this Op Mode is selected from the Driver Station.
//   */
//   @Override
//   public void runOpMode() {
//     float vertical;
//     float horizontal;
//     float pivot;

//     frontRight = hardwareMap.get(DcMotor.class, "frontRight");
//     backRight = hardwareMap.get(DcMotor.class, "backRight");
//     frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
//     backLeft = hardwareMap.get(DcMotor.class, "backLeft");

//     // Put initialization blocks here.
//     telemetry.addData("kkey", 1234);
//     telemetry.update();
//     frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
//     backRight.setDirection(DcMotorSimple.Direction.REVERSE);
//     waitForStart();
//     if (opModeIsActive()) {
//       telemetry.addData("key", 321);
//       telemetry.update();
//       while (opModeIsActive()) {
//         // Put run blocks here.
//         vertical = gamepad1.left_stick_y;
//         horizontal = -gamepad1.left_stick_x;
//         pivot = -gamepad1.right_stick_x;
//         frontRight.setPower(-pivot + (vertical - horizontal));
//         backRight.setPower(pivot + vertical + horizontal);
//         frontLeft.setPower(-pivot + vertical + horizontal);
//         backLeft.setPower(pivot + (vertical - horizontal));
//         telemetry.addData("key", 123);
//         // Put loop blocks here.
//         telemetry.update();
//       }
//     }
//   }
// }
