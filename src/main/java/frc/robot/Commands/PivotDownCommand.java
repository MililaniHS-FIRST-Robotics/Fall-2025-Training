package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.Subsystems.PivotSubsystem;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.GenericHID;

public class PivotDownCommand extends Command{
    PivotSubsystem pivotSubsystem;
    GenericHID controller;

    //Use the pid to make your pivot go to the position 60
    public PivotDownCommand(PivotSubsystem pivotSubsystem, GenericHID controller){
        this.pivotSubsystem = pivotSubsystem;
        
        //add requirements here:)
       addRequirements(pivotSubsystem);
    }
    @Override
    public void initialize(){
//set the setpoint
        pivotSubsystem.motorSetPoint(0);
    }
    @Override
    public void execute(){
    //get output and set it to the motor, but you need to set the process variable/update it in this loop
        double powerOutput = pivotSubsystem.getOutput();
        pivotSubsystem.setPower(powerOutput);

    }
    @Override
    public void end(boolean interrupted){
    //shutdown
    pivotSubsystem.shutdown();
    }
    @Override
    public boolean isFinished(){
        return !controller.getRawButton(Constants.GamepadConstants.kDpadDown); //placeholder //whatever button you set this to
    }
}
