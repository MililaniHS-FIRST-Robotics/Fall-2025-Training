package frc.robot;

import java.net.ProxySelector;

public class PID {
    private double targetPosition, error, kp, ki, kd, kff, output, Derivative, Integral, previousPosition, ILimit, processVariable, setPoint;


    public PID(double kp, double ki, double kd, double kff){
        this.kp = kp;
        this.ki = ki;
        this.kd = kd;
        this.kff = kff;
        previousPosition = 0;

    }
    public void setProcessVariable(double processVariable){
        this.processVariable = processVariable;
    }
    public void setSetpoint(double setPoint){
        this.setPoint = setPoint;
    }
    public double getError(){
        return this.setPoint - this.processVariable;
    }
    public double getOutput(){
        return getError() * kp + Integral * ki + Derivative * kd + Math.copySign(kff, getError());
        
    }
    public void periodic(){
        Integral += getError();
        Derivative = getError() - previousPosition/ 0.02;
        previousPosition = getError();
    }

}
