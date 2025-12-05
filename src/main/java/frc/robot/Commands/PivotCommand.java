package frc.robot.Commands;

import com.revrobotics.spark.SparkFlex;

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
    public void initialize(){
        //Start (once)
    }
    @Override
    public void execute(){
        //Loop
        pivotSubsystem.setMotor1(-1);
        pivotSubsystem.setMotor2(1);
    }
    @Override
    public void end(boolean interupted){
        //What happens at the end of the program (usually just a shutdown)
        pivotSubsystem.setPower(0);
    }
    @Override
    public boolean isFinished(){
        //The requirement to end the command
        return !controller.getRawButton(Constants.GamepadConstants.kAButtonPort);
    }
}
