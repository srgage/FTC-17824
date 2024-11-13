// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
// import com.qualcomm.robotcore.eventloop.opmode.Disabled;
// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.eventloop.opmode.OpMode;
// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.DcMotorSimple;
// import com.qualcomm.robotcore.hardware.Servo;

// @TeleOp(name="CombinedOpMode", group="Iterative Opmode")
// public class CombinedOpMode extends OpMode {
    
//     private DcMotor frontLeftMotor;
//     private DcMotor frontRightMotor;
//     private DcMotor backLeftMotor;
//     private DcMotor backRightMotor;
    
//     private DcMotor elevatorMotor;
//     private Servo armServo;

//     private double armPosition = 0.0;

//     @Override
//     public void init() {
//         frontLeftMotor = hardwareMap.get(DcMotor.class, "frontLeft");
//         frontRightMotor = hardwareMap.get(DcMotor.class, "frontRight");
//         backLeftMotor = hardwareMap.get(DcMotor.class, "backLeft");
//         backRightMotor = hardwareMap.get(DcMotor.class, "backRight");
//         elevatorMotor = hardwareMap.get(DcMotor.class, "arm");
//         armServo = hardwareMap.get(Servo.class, "armUp");

//         telemetry.addData("Status", "Initialized");
//         telemetry.update();
//     }

//     @Override
//     public void start() {
//         telemetry.addData("Status", "Running");
//         telemetry.update();
//     }

//     @Override
//     public void loop() {
//         double rx = gamepad1.left_stick_y * 0.7; // Remember, this is reversed!
//         double x = gamepad1.right_stick_x * 0.7; // Counteract imperfect strafing
//         double y = -gamepad1.left_stick_x * 0.7;

//         double frontLeftPower = y + x +rx;
//         double backLeftPower = y - x + rx;
//         double frontRightPower = y - x - rx;
//         double backRightPower = y + x -rx;

//         frontLeftMotor.setPower(frontLeftPower);
//         frontRightMotor.setPower(frontRightPower);
//         backLeftMotor.setPower(backLeftPower);
//         backRightMotor.setPower(backRightPower);

//         if (gamepad1.dpad_up) {
//             elevatorMotor.setDirection(DcMotorSimple.Direction.FORWARD);
//             elevatorMotor.setPower(0.25);
//         } else if (gamepad1.dpad_down) {
//             elevatorMotor.setDirection(DcMotorSimple.Direction.REVERSE);
//             elevatorMotor.setPower(0.25);
//         } else {
//             elevatorMotor.setPower(0.0);
//         }

//         if (gamepad1.dpad_left) {
//             armPosition += 0.001;
//         } else if (gamepad1.dpad_right) {
//             armPosition -= 0.001;
//         }

//         armServo.setPosition(armPosition);

//         telemetry.addData("Arm Position", armPosition);
//         telemetry.update();
//     }

//     @Override
//     public void stop() {
//         telemetry.addData("Status", "Stopped");
//         telemetry.update();
//     }
// }
