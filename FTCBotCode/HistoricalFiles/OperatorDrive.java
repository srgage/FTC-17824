// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.DcMotor;
// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.hardware.Servo;
// import com.qualcomm.robotcore.hardware.DcMotorSimple;

// @TeleOp (name="OperatorDrive")

// public class OperatorDrive extends LinearOpMode {
    
//     public DcMotor frontLeftMotor;
//     public DcMotor frontRightMotor;
//     public DcMotor backLeftMotor;
//     public DcMotor backRightMotor;
//     public Servo servo;
    
//     private double speed;
//     private double servoPos;
//     private boolean oldServoButton;
    
//     @Override
//     public void runOpMode() {
//     float vertical;
//     float horizontal;
//     float pivot;
   
//         frontLeftMotor = hardwareMap.get(DcMotor.class, "frontLeft");
//         frontRightMotor = hardwareMap.get(DcMotor.class, "frontRight");
//         backLeftMotor = hardwareMap.get(DcMotor.class, "backLeft");
//         backRightMotor = hardwareMap.get(DcMotor.class, "backRight");
//         servo = hardwareMap.get(Servo.class, "servo");
        
//         // Put initialization blocks here
//         servoPos=0;
//         oldServoButton=false;
    
   
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
//       servoButton=gamepad1.a;
        
//         if (servoButton && !oldServoButton){
//             if (servoPos==0) {
//                 servoPosition(0);
//                 servoPos=1;
//             }
//             else{
//                 servo.setPosition(.5);
//                 servoPos=0;
                
                        
//         servo=hardwareMap.servo.get("servo");
//         servo.setPosition(servoPosition);

//         waitForStart();
//         runtime.reset();

//         servoPosition=0.5;
//         servo.setPosition(servoPosition);
//         sleep (2000);

//         servoPosition=1.0;
//         servo.setPosition(servoPosition);
//             }
            
//             }        }
//         telemetry.update();
//       }
//     }
//   }

        
        
        
       

  
