// package org.firstinspires.ftc.teamcode;
// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.DcMotorSimple;
// import com.qualcomm.robotcore.util.ElapsedTime;

// @Autonomous(name = "FreightFenzy_REDAuton1 (Java)")
// public class FreightFenzy_REDAuton1 extends LinearOpMode {

//   private DcMotor frontRight;
//   private DcMotor frontLeft;
//   private DcMotor backRight;
//   private DcMotor backLeft;
  
//   //Convert from the counts per revolution of the encoder to counts per inch
//   static final double HD_COUNTS_PER_REV = 28;
//   static final double DRIVE_GEAR_REDUCTION = 20.15293;
//   static final double WHEEL_CIRCUMFERENCE_MM = 90 * Math.PI;
//   static final double DRIVE_COUNTS_PER_MM = (HD_COUNTS_PER_REV * DRIVE_GEAR_REDUCTION) / WHEEL_CIRCUMFERENCE_MM;
//   static final double DRIVE_COUNTS_PER_IN = DRIVE_COUNTS_PER_MM * 25.4;
  
//   //Create elapsed time variable and an instance of elapsed time
//   private ElapsedTime     runtime = new ElapsedTime();
  
//   // Drive function with 3 parameters
//   private void drive(double power, double leftInches, double rightInches) {
//     int frontRightTarget;
//     int backRightTarget;
//     int frontLeftTarget;
//     int backLeftTarget;

//     if (opModeIsActive()) {
//     // Create target positions
//       frontRightTarget = frontRight.getCurrentPosition() + (int)(rightInches * DRIVE_COUNTS_PER_IN);
//       frontLeftTarget = frontLeft.getCurrentPosition() + (int)(leftInches * DRIVE_COUNTS_PER_IN);
//       backRightTarget = backRight.getCurrentPosition() + (int)(rightInches * DRIVE_COUNTS_PER_IN);
//       backLeftTarget = backLeft.getCurrentPosition() + (int)(leftInches * DRIVE_COUNTS_PER_IN);
      
//       // set target position
//       frontLeft.setTargetPosition(frontLeftTarget);
//       frontRight.setTargetPosition(frontRightTarget);
//       backLeft.setTargetPosition(backLeftTarget);
//       backRight.setTargetPosition(backRightTarget);
      
//       //switch to run to position mode
//       frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//       frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//       backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//       backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
      
//       //run to position at the desiginated power
//       LeftDrive.setPower(power);
//       RightDrive.setPower(power);
      
//       // wait until both motors are no longer busy running to position
//       while (opModeIsActive() && (LeftDrive.isBusy() || RightDrive.isBusy())) {
//       }
      
//       // set motor power back to 0
//       LeftDrive.setPower(0);
//       RightDrive.setPower(0);
//     }
//   }


//   @Override
//   public void runOpMode() {

//     RightDrive = hardwareMap.get(DcMotor.class, "RightDrive");
//     LeftDrive = hardwareMap.get(DcMotor.class, "LeftDrive");
//     Arm = hardwareMap.get(DcMotor.class, "Arm");
//     Intake = hardwareMap.get(DcMotor.class, "Intake");

 
//     LeftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
    
//     waitForStart();
//     if (opModeIsActive()) {
      
//       //segment 1
//       drive(0.7, 30, 15);
      
//       runtime.reset(); // reset elapsed time timer
      
//       //segment 2 - lift arm, drive to shipping hub, outtake freight
//       while (opModeIsActive() && runtime.seconds() <= 7) {
        
//         //lift arm and hold
//         Arm.setTargetPosition(120);
//         Arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//         Arm.setPower(0.3);
        
//         //drive forward for 1 second
//         while (runtime.seconds() > 2 && runtime.seconds() <= 3) {
//           drive(0.4, 4, 4);
//         }
        
//         //run intake
//         while (runtime.seconds() > 4 && runtime.seconds() <= 7) {
//           Intake.setPower(-0.6);
//         }
      
//       // turn off arm and intake
//       Arm.setPower(0);
//       Intake.setPower(0);
      
//       //segment 3 - reverse to get better angle 
//       drive(0.7, -15, -30);
      
//       //segment 4 - drive into warehouse
//       drive(1, 90, 90);
//     }
//   }
// }
