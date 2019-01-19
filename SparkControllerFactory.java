


import com.revrobotics.*;
import com.revrobotics.CANDigitalInput.LimitSwitchPolarity;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class SparkControllerFactory {
    public static CANSparkMax createDefaultSparkMax(int id,MotorType mType, CANEncoder encoder){
        CANSparkMax sparkmax = new CANSparkMax(id,mType );
            sparkmax.getEncoder();
            return sparkmax;
    }
    public static CANSparkMax createFollower(int id, MotorType mType,CANSparkMax leader){
        CANSparkMax sparkmax = new CANSparkMax(id, mType);
        sparkmax.follow(leader);
        return sparkmax;

            
        
    }
    
    
}