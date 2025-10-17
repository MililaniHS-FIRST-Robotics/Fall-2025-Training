package frc.robot.Subsystems;

import com.revrobotics.spark.SparkMax;

public class PivotSubsystems {
    private SparkMax motor1;
    private SparkMax motor2;
public PivotSubsystems(){
    motor1 = new SparkMax(0, MotorType.kBrushless);
    motor2 = new SparkMax(0, MotorType.kBrushless);
   }
}
