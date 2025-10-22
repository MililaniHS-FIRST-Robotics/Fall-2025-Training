package frc.robot.Commands;

import edu.wpi.first.wpilibj.GenericHID;
import frc.robot.Subsystems.*;
public class PivotCommand {
    PivotSubsystem pivotSubsystem;
    GenericHID controller;
    public PivotCommand(PivotSubsystem pivotSubsystem, GenericHID controller){
        this.pivotSubsystem = pivotSubsystem;
        this.controller = controller;
    }
}
