package frc.robot.Subsystems;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private TalonFX topIntake;
    private TalonFX bottomIntake;
    // private TalonFXConfiguration topIntakeConfig;
    // private TalonFXConfiguration bottomIntakeConfig;


    public IntakeSubsystem(){
        topIntake = new TalonFX(2);
        bottomIntake = new TalonFX(3);

        // topIntakeConfig = new TalonFXConfiguration();
        // bottomIntakeConfig = new TalonFXConfiguration();
        // topIntakeConfig.MotorOutput;

    }

    public void setIntakePower(double power){
        topIntake.set(-power);
        bottomIntake.set(power);
    }
    public void shutdown(){
        topIntake.set(0);
        bottomIntake.set(0);
    }

    
}
