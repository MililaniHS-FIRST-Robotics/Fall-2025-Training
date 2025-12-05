package frc.robot.Commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.GamepadConstants;
import frc.robot.Subsystems.IntakeSubsystem;
import frc.robot.Subsystems.PivotSubsystem;

public class IntakeCommand extends Command{
    IntakeSubsystem intakeSubsystem;
    GenericHID controller;


    public IntakeCommand(IntakeSubsystem intakeSubsystem, GenericHID controller){
        this.intakeSubsystem = intakeSubsystem;
        this.controller = controller;
        addRequirements(intakeSubsystem);
    }

    @Override
    public void execute(){
        //power method
        intakeSubsystem.setIntakePower(0.3);
    }
    @Override
    public void end(boolean interrupted){
        //shutdown method
        intakeSubsystem.shutdown();
    }
    @Override
    public boolean isFinished(){
        //gamepad you want to use
        return !controller.getRawButton(GamepadConstants.kRightBumperPort);
    }

}
