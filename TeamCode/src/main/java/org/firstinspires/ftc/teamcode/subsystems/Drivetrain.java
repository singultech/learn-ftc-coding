package org.firstinspires.ftc.teamcode.subsystems;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class Drivetrain {
    DcMotorEx frontLeft;
    DcMotorEx frontRight;
    DcMotorEx backRight;
    DcMotorEx backLeft;


    public Drivetrain(HardwareMap hmap) {

        frontLeft = hmap.get(DcMotorEx.class, "frontLeft");
        frontRight = hmap.get(DcMotorEx.class, "frontRight");
        backRight = hmap.get(DcMotorEx.class, "backRight");
        backLeft = hmap.get(DcMotorEx.class, "backLeft");
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void moveForward() {
        frontLeft.setPower(1);
        frontRight.setPower(1);
        backRight.setPower(1);
        backLeft.setPower(1);
    }

    public void setForwardVelocity(double velocity) {
        frontLeft.setPower(velocity);
        frontRight.setPower(velocity);
        backRight.setPower(velocity);
        backLeft.setPower(velocity);
    }

    public void rotateBot(double velocity) {
        frontLeft.setPower(velocity);
        frontRight.setPower(-velocity);
        backRight.setPower(-velocity);
        backLeft.setPower(velocity);
    }

    public void strafeBot(double velocity) {
        frontLeft.setPower(velocity);
        frontRight.setPower(-velocity);
        backRight.setPower(velocity);
        backLeft.setPower(-velocity);
    }
}
