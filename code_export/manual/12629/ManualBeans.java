package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "ManualBeans (Blocks to Java)", group = "")
public class ManualBeans extends LinearOpMode {

  private DcMotor arm;
  private DcMotor mFL;
  private DcMotor mFR;
  private DcMotor mBL;
  private DcMotor mBR;
  private Servo s1;
  private Servo s2;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    double spd;
    double s_1_tpos;
    double s_2_tpos;
    boolean a_active;
    boolean locking;

    arm = hardwareMap.dcMotor.get("arm");
    mFL = hardwareMap.dcMotor.get("mFL");
    mFR = hardwareMap.dcMotor.get("mFR");
    mBL = hardwareMap.dcMotor.get("mBL");
    mBR = hardwareMap.dcMotor.get("mBR");
    s1 = hardwareMap.servo.get("s1");
    s2 = hardwareMap.servo.get("s2");

    // Put initialization blocks here.
    spd = 1;
    a_active = false;
    locking = false;
    s_1_tpos = 0;
    s_2_tpos = 1;
    arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    mFL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    mFR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    mBL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    mBR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    waitForStart();
    s1.setPosition(1);
    sleep(250);
    s2.setPosition(0);
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        if (gamepad1.dpad_up) {
          mFL.setPower(-spd);
          mFR.setPower(spd);
          mBL.setPower(-spd);
          mBR.setPower(-spd);
        } else if (gamepad1.dpad_down) {
          mFL.setPower(spd);
          mFR.setPower(-spd);
          mBL.setPower(spd);
          mBR.setPower(spd);
        } else if (gamepad1.dpad_left) {
          mFL.setPower(spd);
          mFR.setPower(spd);
          mBL.setPower(-spd);
          mBR.setPower(spd);
        } else if (gamepad1.dpad_right) {
          mFL.setPower(-spd);
          mFR.setPower(-spd);
          mBL.setPower(spd);
          mBR.setPower(-spd);
        } else if (gamepad1.left_bumper) {
          mFL.setPower(spd);
          mFR.setPower(spd);
          mBL.setPower(spd);
          mBR.setPower(-spd);
        } else if (gamepad1.right_bumper) {
          mFL.setPower(-spd);
          mFR.setPower(-spd);
          mBL.setPower(-spd);
          mBR.setPower(spd);
        } else {
          mFL.setPower(0);
          mFR.setPower(0);
          mBL.setPower(0);
          mBR.setPower(0);
        }
        if (gamepad1.x) {
          arm.setPower(-0.35);
        } else if (gamepad1.y) {
          arm.setPower(0.35);
        } else {
          arm.setPower(0);
        }
        if (gamepad1.b) {
          if (!locking) {
            s_1_tpos = gamepad1.right_trigger;
            s_2_tpos = 1 - gamepad1.left_trigger;
          }
        } else {
          spd = 1 - gamepad1.left_trigger;
          if (!locking) {
            s_1_tpos = gamepad1.right_trigger;
            s_2_tpos = 1 - gamepad1.right_trigger;
          }
        }
        if (gamepad1.a) {
          if (!a_active) {
            if (locking) {
              locking = false;
            } else {
              locking = true;
            }
            a_active = true;
          }
        } else {
          a_active = false;
        }
        s1.setPosition(s_1_tpos);
        s2.setPosition(s_2_tpos);
      }
    }
  }
}
