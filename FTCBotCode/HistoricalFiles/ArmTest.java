// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.util.Range;
// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.util.ElapsedTime;

// @TeleOp(name="Basic: Arm Test", group="Linear Opmode")

// public class ArmTest extends LinearOpMode {
    
//     private DcMotor arm;
//     private DcMotor wrist;
//     private ElapsedTime runtime = new ElapsedTime();

//     public void runOpMode(){
//         arm  = hardwareMap.get(DcMotor.class, "arm");
//         wrist = hardwareMap.servo.get(DcMotor.class, "wrist");
        
//         waitForStart();
//         runtime.reset();

//         // run until the end of the match (driver presses STOP)
//         while (opModeIsActive()) {
            
//             double leftStick = (-gamepad1.left_stick_y);
//             double rightStick = gamepad1.right_stick_y;
//             arm.setPower(leftStick);
//             wrist.setPower(rightStick);
            
//             telemetry.addData("Status", "Run Time: " + runtime.toString());
//             telemetry.addData("Motors", "arm (%.2f), wrist (%.2f)", leftStick, rightStick);
//             telemetry.update();
//         }
//     }

//     // todo: write your code here
// }
