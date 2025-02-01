package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;


public class DriveSubsys {
    SparkMax frontRight = new SparkMax(0, MotorType.kBrushless);
    SparkMax frontLeft = new SparkMax(0, MotorType.kBrushless);
    SparkMax backRight = new SparkMax(0, MotorType.kBrushless);
    SparkMax backLeft = new SparkMax(0, MotorType.kBrushless);

    public void drive(double leftval, double rightval){
        frontRight.set(rightval);
        backRight.set(rightval);
        frontLeft.set(leftval);
        backLeft.set(leftval);
    }

}
