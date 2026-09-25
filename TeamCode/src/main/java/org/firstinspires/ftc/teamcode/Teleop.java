package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;


@TeleOp
public class Teleop extends OpMode {

    Drivetrain drivetrain;

    @Override
    public void init() {
        drivetrain = new Drivetrain();

    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void loop() {

    }
}