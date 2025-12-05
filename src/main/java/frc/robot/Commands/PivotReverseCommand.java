package frc.robot.Commands;

import com.revrobotics.spark.SparkFlex;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.Subsystems.PivotSubsystem;
public class PivotReverseCommand extends Command{
    PivotSubsystem pivotSubsystem;
    GenericHID controller; 


    public PivotReverseCommand(PivotSubsystem pivotSubsystem, GenericHID controller) {
        this.pivotSubsystem = pivotSubsystem;
        this.controller = controller;

        addRequirements(pivotSubsystem);
    }

    @Override
    public void execute() {
        pivotSubsystem.setPower(-0.025);
    }

    @Override
    public void end (boolean interrupted) {
        pivotSubsystem.shutdown();
    }

    @Override
    public boolean isFinished() {
        return !controller.getRawButton(Constants.GamepadConstants.kBButtonPort);
    }
}
