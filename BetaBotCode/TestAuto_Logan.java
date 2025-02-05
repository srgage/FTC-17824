/*package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ServoController;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
 
@Autonomous(name = "TestAuto")

public class TestAuto_Logan extends LinearOpMode {
    
    private DcMotor right;
    private DcMotor left;
    private ServoController ControlHub_ServoController;
    private Servo test;


    @Override
    public void runOpMode() {

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        right = hardwareMap.get(DcMotor.class, "right");
        left = hardwareMap.get(DcMotor.class, "left");
        ControlHub_ServoController = hardwareMap.get(ServoController.class, "Control Hub");
        test = hardwareMap.get(Servo.class, "test");
        
        left.setDirection(DcMotorSimple.Direction.REVERSE);
        
        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        telemetry.addData("Status", "Running");
        telemetry.update();
            
        // test.setPosition(1);
        // sleep(3000);
        // test.setPosition(0);
        // sleep(3000);
        
        // moveStraight(0.2, 1);
        
        // right.setPower(0.1);
        // left.setPower(-0.1);
        // sleep(2700);
        // right.setPower(0);
        // left.setPower(0);
        
        // turn2(0.2,2);
        moveStraight(0.3, 1);

    }

    // Positive power is forward, negative power is backwards
    public void moveStraight(double power, double time){
        right.setPower(power);
        left.setPower(power);
        sleep((long)(time * 1000));
        right.setPower(0);
        left.setPower(0);
    }
    
    // Turn1 rotates from the center
    // Positive power is left, negative power is right
    public void turn1(double power, double time) {
        right.setPower(power);
        left.setPower(-power);
        sleep((long)(time * 1000));
        right.setPower(0);
        left.setPower(0);
    }
    
    // Turn2 rotates like a car
    // Positive power is left, negative power is right
    public void turn2(double power, double time) {
        right.setPower(power);
        left.setPower(0);
        sleep((long)(time * 1000));
        right.setPower(0);
        left.setPower(0);
    }
    
    
    
}*/
