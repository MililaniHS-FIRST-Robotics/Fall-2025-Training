package frc.robot.Commands;
import frc.robot.*;
import frc.robot.Subsystems.pivotSubsystem;
import edu.wpi.first.wpilibj.GenericHID;

public class pivotCommand {
    pivotSubsystem pivotsubsystem;
    GenericHID controller;
    public pivotCommand(pivotSubsystem pivotsubsystem, GenericHID controller){
        this.pivotsubsystem = pivotsubsystem;
        this.controller = controller;
    }
}
