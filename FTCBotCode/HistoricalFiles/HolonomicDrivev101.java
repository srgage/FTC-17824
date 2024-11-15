// package org.firstinspires.ftc.teamcode;
// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.DcMotorSimple;
// import com.qualcomm.robotcore.hardware.Servo;
// import com.qualcomm.robotcore.hardware.ServoController;

// @TeleOp(name = "HolonomicDrive112 (Blocks to Java)")
// public class HolonomicDrive112 extends LinearOpMode {

//   private DcMotor frontRight;
//   private DcMotor backRight;
//   private DcMotor frontLeft;
//   private DcMotor backLeft;
//   private ServoController ControlHub_ServoController;
//   private Servo servo;
//   private DcMotor liftMotor;

//   /**
//   * This function is executed when this Op Mode is selected from the Driver Station.
//   */
//   @Override
//   public void runOpMode() {
//     float horizontal;
//     float vertical;
//     float pivot;

//     frontRight = hardwareMap.get(DcMotor.class, "frontRight");
//     backRight = hardwareMap.get(DcMotor.class, "backRight");
//     frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
//     backLeft = hardwareMap.get(DcMotor.class, "backLeft");
//     ControlHub_ServoController = hardwareMap.get(ServoController.class, "Control Hub");
//     servo = hardwareMap.get(Servo.class, "servo");
//     liftMotor = hardwareMap.get(DcMotor.class, "liftMotor");

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
//         horizontal = gamepad1.left_stick_x;
//         vertical = -gamepad1.right_stick_y;
//         pivot = -gamepad1.left_stick_y;
//         frontRight.setPower(-pivot + (vertical - horizontal));
//         backRight.setPower(-pivot + vertical + horizontal);
//         frontLeft.setPower(pivot + vertical + horizontal);
//         backLeft.setPower(pivot + (vertical - horizontal));
//         telemetry.addData("key", 123);
//         // Put loop blocks here.
//         telemetry.update();
//         ControlHub_ServoController.pwmEnable();
//         if (gamepad1.dpad_down) {
//           servo.setPosition(0.35);
//         }
//         if (gamepad1.dpad_up) {
//           servo.setPosition(-0.5);
//         }
//         if (gamepad1.right_bumper) {
//           liftMotor.setPower(0.5);
//         }
//         if (gamepad1.left_bumper) {
//           liftMotor.setPower(-0.5);
//         }
//         if (gamepad1.b) {
//           liftMotor.setPower(0);
//         }
//       }
//     }
//   }
// }
