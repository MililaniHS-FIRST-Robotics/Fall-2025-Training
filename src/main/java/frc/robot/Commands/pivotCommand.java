package frc.robot.Commands;
import frc.robot.*;
import frc.robot.Subsystems.pivotSubsystem;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;

public class pivotCommand extends Command{
    pivotSubsystem pivotsubsystem;
    GenericHID controller;
    public pivotCommand(pivotSubsystem pivotsubsystem, GenericHID controller){
        this.pivotsubsystem = pivotsubsystem;
        this.controller = controller;
        addRequirements(pivotsubsystem);
    }
    @Override
    public void initialize(){
        //start (once)
    }
    @Override
    public void execute(){
        //loop
        pivotsubsystem.setMotor1(-1);
        pivotsubsystem.setMotor2(1);
    }
    @Override
    public void end(boolean interupted){
        //What happens at the end of the program (usually shutdown)
        pivotsubsystem.setMotor1(0);
        pivotsubsystem.setMotor2(0);
    }
    @Override
    public boolean isFinished(){
        //the requirement to end the command
        return !controller.getRawButton(Constants.GamepadConstants.kAButtonPort);
    }
}
