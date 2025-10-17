package Subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class pivotSubsystem {
    private SparkMax motor1;
    private SparkMax motor2;
    public pivotSubsystem(){
        motor1 = new SparkMax(0, MotorType.kBrushless);
        motor2 = new SparkMax(0, MotorType.kBrushless);
    }

    public void setPowe(double power){
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
