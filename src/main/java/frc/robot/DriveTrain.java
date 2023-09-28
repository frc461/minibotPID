package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
    private TalonFX rightMotor = new TalonFX(5);
    private TalonFX leftMotor = new TalonFX(6);
    

    public void drive(double target) {
        rightMotor.set(ControlMode.Velocity, 0.1);
        leftMotor.set(ControlMode.Velocity, 0.1);
        if(rightMotor.getSelectedSensorPosition()>target && leftMotor.getSelectedSensorPosition()>target) {
            rightMotor.set(ControlMode.Velocity, 0);
            leftMotor.set(ControlMode.Velocity, 0);
        }
    }
}
