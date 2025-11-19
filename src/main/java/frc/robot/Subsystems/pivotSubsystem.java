package frc.robot.Subsystems;

import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class pivotSubsystem extends SubsystemBase{
    private double targetPosition, error, kp, ki, kd, kff, output;
    private SparkMax motor1;
    private SparkMax motor2;
    private RelativeEncoder encoder1;
    public pivotSubsystem(){
        motor1 = new SparkMax(2, MotorType.kBrushless);
        motor2 = new SparkMax(3, MotorType.kBrushless);

        encoder1 = motor1.getEncoder();

        targetPosition = 40;
        kp = .1;
        ki = 0;
        kd = 0;
        kff = 0;
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
    public double getMotorPosition(){
        return encoder1.getPosition();
    }

    public void periodic(){
        error = targetPosition - getMotorPosition();
        output = error * kp + kff;

        
    }
}
