package frc.robot.Subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class PivotSubsystem {
    private SparkMax motor1;
    private SparkMax motor2;
   public PivotSubsystem(){
    motor1 = new SparkMax(0, MotorType.kBrushless); //ID are placeholders
    motor2 = new SparkMax(1, MotorType.kBrushless);
   } 
   public void setPower(double power){
    motor1.set(power);
    motor2.set(power);
   }
   public void setMotor1(double power){
    motor1.set(power);
   }
   public void setMotor2(double power){
    motor2.set(power);
   }
}
