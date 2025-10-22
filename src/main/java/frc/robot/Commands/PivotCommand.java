package frc.robot.Commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.Subsystems.PivotSubsystem;

public class PivotCommand extends Command{
    PivotSubsystem pivotSubsystem;
    GenericHID controller;

    public PivotCommand(PivotSubsystem pivotSubsystem, GenericHID controller) {
        this.pivotSubsystem = pivotSubsystem;
        this.controller = controller;

        addRequirements(pivotSubsystem);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
pivotSubsystem.setMotor1Power(-1);
pivotSubsystem.setMotor2Power(1);
    }
    @Override
    public void end (boolean interrupted) {
        pivotSubsystem.setMotor1Power(0);
        pivotSubsystem.setMotor2Power(0);
    }

    @Override
    public boolean isFinished() {
        return !controller.getRawButton(Constants.GamepadConstants.kAButtonPort);
    }
}
