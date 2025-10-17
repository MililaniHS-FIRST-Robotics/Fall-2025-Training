package frc.robot.Subsystems;

public class PivotSubsystem(){
    private SparkMax motor1;
    private SparkMax motor2;

    


    public PivotSubsystem(){
        motor1 = new SparkMax(deviceid0, MotorType.kBrushless);
        motor2 = new SparkMax(deviceid1, MotorType.kBrushless);

    }
    public void setPower(double power){
        motor1.set(power);       
        motor2.set(power);

    }

    public void setPower(double power){
        motor1.set(power);
    }

    public void setPower(double power){
        motor2.set(power);
    }
}