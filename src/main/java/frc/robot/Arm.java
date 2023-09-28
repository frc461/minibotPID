package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
    private PIDController PidController = new PIDController(0.1, 0
    , 0);
    private CANSparkMax arm = new CANSparkMax(4, MotorType.kBrushless);

    public void move(double target) {
        while(true){
            arm.set(PidController.calculate(arm.getEncoder().getPosition(), target));
            System.out.println(arm.getEncoder().getPosition());
        }
    }   
}
