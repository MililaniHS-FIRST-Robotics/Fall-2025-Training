package frc.robot.Subsystems;

import com.revrobotics.spark.SparkMax;
<<<<<<< HEAD
import com revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2,command.SubsystemBase;

public class PivotSubsystem {
    
=======
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class PivotSubsystem {
    private SparkMax motor1;
    private SparkMax motor2;
public PivotSubsystem(){
    motor1 = new SparkMax(0, MotorType.kBrushless);
    motor2 = new SparkMax(0, MotorType.kBrushless);
   }
   public void setPower(double power){
    motor1.set(power);
    motor2.set(power);
   }
   public void setMotor1(double power) {
    motor1.set(power);
   }
   public void setMotor2(double power) {
    motor2.set(power);
   }
>>>>>>> 98ee0fb0a321cd25ac1139909dbd7586e6e8de69
}
