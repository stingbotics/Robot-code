package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "template", group = "")
public class temp extends LinearOpMode {

    //define names of motors, sensors, etc

    /**
     * This function is executed when this Op Mode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() {
        //Set up variables

        //make motor vars, ie arm = hardwareMap.dcMotor.get("arm");

        // Put initialization blocks here.
        if (opModeIsActive()) {
        // Put run blocks here.
            while (opModeIsActive()) {
            //main loop
            }
        }
    }
}
