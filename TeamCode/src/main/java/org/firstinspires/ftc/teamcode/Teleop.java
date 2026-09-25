package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.subsystems.GamepadPair;


@TeleOp
public class Teleop extends OpMode {

    Drivetrain drivetrain;
    GamepadPair gamepadPair;

    @Override
    public void init() {
        drivetrain = new Drivetrain(hardwareMap);
        gamepadPair = new GamepadPair(gamepad1, gamepad2);
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void loop() {

        drivetrain.setForwardVelocity(gamepadPair.joystickValue(1, GamepadPair.Side.LEFT, GamepadPair.Axis.Y));
        drivetrain.rotateBot(gamepadPair.joystickValue(1, GamepadPair.Side.RIGHT, GamepadPair.Axis.X));
        drivetrain.strafeBot(gamepadPair.joystickValue(1, GamepadPair.Side.LEFT, GamepadPair.Axis.X));
    }
}