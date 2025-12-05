package frc.robot.Subsystems;

import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.servohub.ServoHub.ResetMode;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkFlexConfig;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.PID;

public class PivotSubsystem extends SubsystemBase {
    private SparkFlex leftMotor;
    private SparkFlex rightMotor;
    // private SparkFlexConfig leftMotorConfig;
    // private SparkFlexConfig rightMotorConfig;
    private RelativeEncoder encoder1;
    private PIDController pidController;



   public PivotSubsystem(){
    leftMotor = new SparkFlex(4, MotorType.kBrushless); //ID are placeholders
    rightMotor = new SparkFlex(5, MotorType.kBrushless);
    // leftMotorConfig = new SparkFlexConfig();
    pidController = new PIDController(0, 0, 0);
//     leftMotorConfig
//         .inverted(true)
//         .idleMode(IdleMode.kBrake);
//     rightMotorConfig
//         .inverted(false)
//         .idleMode(IdleMode.kBrake);
 } 

   public void setMotor1(double power){
    leftMotor.set(power);
   }

   public void setMotor2(double power){
    rightMotor.set(power);
   }
   public void setPower(double power){
    leftMotor.set(power);
    rightMotor.set(-power);
   }
   
   public double getCurrentError(){
    return pidController.getError();
   }

   public void motorSetPoint(double target){
    pidController.setSetpoint(target);
   }

   public double getSetpoint(){
        return pidController.getSetpoint();
   }
    public double getOutput(){
        return pidController.calculate(encoder1.getPosition());
    }

   public double getMotor1Position(double target) {
    return encoder1.getPosition();
   }
   public void shutdown(){
    rightMotor.set(0);
    leftMotor.set(0);
   }

   public void periodic() {
   }
   
}
