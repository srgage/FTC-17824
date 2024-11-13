// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.DcMotorSimple;
// import com.qualcomm.robotcore.hardware.Servo;
// import com.qualcomm.robotcore.hardware.ServoController;
// import com.qualcomm.robotcore.hardware.HardwareMap;
// import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
// import com.qualcomm.robotcore.util.ElapsedTime;

// @TeleOp(name = "CenterStageTest1 (Blocks to Java)")

// public class CenterStageTest1 extends LinearOpMode {

//     // todo: write your code here
//   private ServoController ControlHub_ServoController;
//   public Servo servo;
//   private DcMotor frontRight;
//   private DcMotor backRight;
//   private DcMotor frontLeft;
//   private DcMotor backLeft;
//   // private DcMotor liftMotor;
  
//   //variables
//   static final double HD_COUNTS_PER_REV = 28;
//   static final double DRIVE_GEAR_REDUCTION = 20.15293;
//   static final double WHEEL_CIRCUMFERENCE_MM = 90 * Math.PI;
//   static final double DRIVE_COUNTS_PER_MM = (HD_COUNTS_PER_REV * DRIVE_GEAR_REDUCTION) / WHEEL_CIRCUMFERENCE_MM;
//   static final double DRIVE_COUNTS_PER_IN = DRIVE_COUNTS_PER_MM *25.4;
  
//   public void runOpMode() {
//     // float horizontal;
//     // float vertical;
//     // float pivot;
//     // float armDown;
//     // float armUp;

//     frontRight = hardwareMap.get(DcMotor.class, "frontRight");
//     backRight = hardwareMap.get(DcMotor.class, "backRight");
//     frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
//     backLeft = hardwareMap.get(DcMotor.class, "backLeft");
//     ControlHub_ServoController = hardwareMap.get(ServoController.class, "Control Hub");
//     servo = hardwareMap.get(Servo.class, "servo");
//     // liftMotor = hardwareMap.get(DcMotor.class, "liftMotor");

//     // Put initialization blocks here.
//     telemetry.addData("kkey", 1234);
//     telemetry.update();
//     frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
//     backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
//     waitForStart();
    
//     int rightTarget;
//     int leftTarget;
    
//     if (opModeIsActive()) {
//       ControlHub_ServoController.pwmEnable();
//       telemetry.addData("key", 321);
//       telemetry.update();
      
//       while (opModeIsActive()) {
//         // Put run blocks here.
//         // telemetry.addData("key", 123);
//         // frontRight.setPower(3);
//         // backRight.setPower(3);
//         // frontLeft.setPower(3);
//         // backLeft.setPower(3);
//       }
//       frontRightTarget = frontRight.getCurrentPosition() + (int)(rightInches * DRIVE_COUNTS_PER_IN);
//       frontLeftTarget = frontLeft.getCurrentPosition() + (int)(leftInches * DRIVE_COUNTS_PER_IN);
//       backRightTarget = backRight.getCurrentPosition() + (int)(rightInches * DRIVE_COUNTS_PER_IN);
//       backLeftTarget = backLeft.getCurrentPosition() + (int)(leftInches * DRIVE_COUNTS_PER_IN);
      
//       // frontRight = frontRight.getCurrentPosition() + (int)(30 * DRIVE_COUNTS_PER_IN);
//       // frontLeft = frontLeft.get.CurrentPosition() + (int)(15 * DRIVE_COUNTS_PER_IN);
//       // backRight = backRight.getCurrentPosition() + (int)(30 * DRIVE_COUNTS_PER_IN);
//       // backLeft = backLeft.get.CurrentPosition() + (int)(15 * DRIVE_COUNTS_PER_IN);
      
//       frontRight.setTargetPosition(rightTarget);
//       backRight.setTargetPosition(rightTarget);
//       frontLeft.setTargetPosition(leftTarget);
//       backLeft.setTargetPosition(leftTarget);
//     }
//   }
// }