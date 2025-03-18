package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;


public class DriveSubsys {
    SparkMax left5 = new SparkMax(5, MotorType.kBrushless);
    SparkMax left3 = new SparkMax(3, MotorType.kBrushless);
    SparkMax right4 = new SparkMax(4, MotorType.kBrushless);
    SparkMax right2 = new SparkMax(2, MotorType.kBrushless);

    public void drive(double leftval, double rightval){
        right4.set(rightval);
        right2.set(rightval);
        left3.set(leftval);
        left5.set(leftval);
    }

}
