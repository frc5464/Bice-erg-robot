package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;


public class MechSubsys {
    SparkMax mechanism = new SparkMax(34, MotorType.kBrushless);

    public void intake(){
        mechanism.set(0.5);
    }

    public void vomit(){
        mechanism.set(-0.5);
    }
    public void stop(){
        mechanism.set(0);
    }


}
