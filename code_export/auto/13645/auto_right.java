package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "auto_right (Blocks to Java)", group = "")
public class auto_right extends LinearOpMode {

  private DcMotor mFL;
  private DcMotor mFR;
  private DcMotor mBL;
  private DcMotor mBR;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    mFL = hardwareMap.dcMotor.get("mFL");
    mFR = hardwareMap.dcMotor.get("mFR");
    mBL = hardwareMap.dcMotor.get("mBL");
    mBR = hardwareMap.dcMotor.get("mBR");

    // Put initialization blocks here.
    mFL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    mFR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    mBL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    mBR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    waitForStart();
    if (opModeIsActive()) {
      mFL.setPower(-1);
      mFR.setPower(-1);
      mBL.setPower(-1);
      mBR.setPower(-1);
      sleep(1000);
      mFL.setPower(0);
      mFR.setPower(0);
      mBL.setPower(0);
      mBR.setPower(0);
    }
  }
}
