package frc.robot.Subsystems;

import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PivotSubsystem extends SubsystemBase{
    private SparkMax motor1;
    private SparkMax motor2;

    private AbsoluteEncoder encoder1;

    private double targetPosition, error, kp, ki, kd, kff, Integral, Derivative, output, previousPosition;
    public PivotSubsystem(){
       motor1 = new SparkMax(2, MotorType.kBrushless); //ID are placeholders
       motor2 = new SparkMax(3, MotorType.kBrushless);

       encoder1 = motor1.getAbsoluteEncoder();
        targetPosition = 60;
        kp = .001;
        ki = 0;
        kd = 0;
        kff = 0;
        output = 0;
        previousPosition = 0;


    }
    public void setMotor1(double power){
        motor1.set(power);
    }
    public void setMotor2(double power){
        motor2.set(power);
    }
    public double getMotor1Position(){
        return encoder1.getPosition();
    }

    public void periodic(){
        error = targetPosition - getMotor1Position();
        Integral += error;
        Derivative = (getMotor1Position() - previousPosition)/0.02;

        output = error * kp + Integral * ki + Derivative * kd + kff
        setMotor1(output);
        previousPosition = getMotor1Position()
    
    }
}
