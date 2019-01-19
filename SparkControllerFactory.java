package com.team3925.utils;


import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class SparkControllerFactory {
    public static CANSparkMax createDefaultSparkMax(int id,MotorType mType){
        CANSparkMax sparkmax = new CANSparkMax(id,mType );
            return sparkmax;
    }
    public static CANSparkMax createFollower(int id, MotorType mType,CANSparkMax leader){
        CANSparkMax sparkmax = new CANSparkMax(id, mType);
        sparkmax.follow(leader);
        return sparkmax;
            
        
    }
    
    
}