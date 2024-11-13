// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.DcMotorSimple;
// import com.qualcomm.robotcore.hardware.Servo;
// import com.qualcomm.robotcore.hardware.ServoController;

// @TeleOp(name = "PowerPlayCombined (Blocks to Java)")
// public class HolonomicDrive11 extends LinearOpMode {

//   private DcMotor frontRight;
//   private DcMotor backRight;
//   private DcMotor frontLeft;
//   private DcMotor backLeft;
//   private ServoController ControlHub_ServoController;
//   private Servo servo;
//   private DcMotor liftMotor;

// Servo servo;
// double tgtPower=0;
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
//     ControlHub_ServoController = hardwareMap.get(ServoController.class, "Control Hub");
//     servo= hardwareMap.get(Servo.class, "servo");
//     liftMotor = hardwareMap.get(DcMotor.class, "liftMotor");

//     // Put initialization blocks here.
//     telemetry.addData("kkey", 1234);
//     telemetry.update();
    
//     motorfrontRight.setDirection(DcMotorSimple.Direction.REVERSE);
//     motorbackRight.setDirection(DcMotorSimple.Direction.REVERSE);
//     servo.setPosition(servoPosition);
//     motorliftMotor.setMode(DCMotorSimple.RunMOde.RUN_TO_POSITION);
    
    
//     waitForStart();
//     runtime.reset();
    
   
//     while (opModeIsActive()); {
//       telemetry.addData("Status", "Run Time:"+ runtime.toString());
//       telemetry.update();
      
//         horizontal= gamepad1.left_stick_y;
//         vertical = -gamepad1.left_stick_x*1.5;
//         pivot= gamepad1.right_stick_y;
        
//         denominator=Math.max(Math.abs(vertical)+Math.abs(horizontal)+Math.abs(pivot),1);
        
//         frontRightPower=(-pivot + vertical - horizontal)/denominator;
//         backRightPower=(-pivot + vertical + horizontal)/denominator;
//         frontLeftPower=(pivot + vertical + horizontal)/denominator;
//         backLeftPower=(pivot + vertical - horizontal)/denominator;
        
//         motorfrontLeft.setPower(frontLeftPower);
//         motorbackLeft.setPower(backLeftPower);
//         motorfrontRight.setPower (frontRightPower);
//         motorbackRight.setPower(backRightPower);
         
//         telemetry.addData("key", 123);
//         // Put loop blocks here.
//         telemetry.update();
    
//         ControlHub_ServoController.pwmEnable();
        
//         if (gamepad1.dpad_down) {
//           servoPosition(-0.5);
//         } else if (gamepad1.dpad_up) {
//           servoPosition(0.35);
//         } else {
//           if (gamepad1.right_bumper) {
//             liftMotor.setPower(0.8);
//             liftMotor.setTargetPosition(1200);
//           } else if (gamepad1.left_bumper) {
//             liftMotor.setPower(.6);
//             liftMotor.setTargetPosition(-840);
//           } else {
//             if (gamepad1.x) {
//               requestOpModeStop();
//             }
//             if (gamepad1.b) {
//               liftMotor.setPower(0);
//             }
//           }
//         }
        
//       if (gamepad1.right_bumper) {
//             liftMotor.setTargetPosition(840);
//           } 
//       else if (gamepad1.left_bumper) {
//             liftMotor.setTargetPosition(-840);
//           }
            
//           liftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
   
  
      
//         if (gamepad1.right_bumper) {
//             liftMotor.setTargetPosition(840);
//           } else if (gamepad1.left_bumper) {
//             liftMotor.setTargetPosition(-840);
//             }
            
//           liftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            
            
//         if (gamepad1.b) {
//               liftMotor.setPower(0);
//             }
//             idle();
//           }
//         }
     
//         }
      
     
    

