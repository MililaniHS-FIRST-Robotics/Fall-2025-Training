package frc.robot.Commands;

import edu.wpi.first.wpilibj.GenericHID;
import frc.robot.Subsystems.PivotSubsystem;
public class PivotCommand {
    PivotSubsystem pivotSubsystem;
    GenericHID controller;
    public PivotCommand(PivotSubsystem pivotSubsystem, GenericHID controller){
        this.pivotSubsystem = pivotSubsystem;
        this.controller = controller;
    }
    //init
    //The thing that runs at the start of the command
    //execute
    //The thing that loops continously, typically the action
    //end
    //the thing that runs when the command is finished (shutdown)
    //isFinished
    //The requirement to end the command

}
