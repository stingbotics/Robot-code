package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "template", group = "")
public class temp extends LinearOpMode {

    static final int WHEEL_DIAMETER_MM = 13;
    static final int ROBOT_HORIZ_BEAM_MM = 330;

    //define names of motors, sensors, etc

    private DcMotor left;
    private DcMotor right;

    /**
     * This function is executed when this Op Mode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() {
        //Set up variables

        //make motor vars, ie arm = hardwareMap.dcMotor.get("arm");

        left = hardwareMap.dcMotor.get("left");
        right = hardwareMap.dcMotor.get("right");

        // Put initialization blocks here.
        if (opModeIsActive()) {
        // Put run blocks here.
            while (opModeIsActive()) {
            //main loop
            }
        }
    }

    // functional group

    @Override
    public void turn(speedCoeff,degrees) {
        float rots = (degrees/360)*(ROBOT_HORIZ_BEAM_MM/WHEEL_DIAMETER_MM);
        int counts = Math.round(rots*1440);


    }
}
