
package frc.robot.Subsystems;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Commands.*;


public class PivotCan extends Subsystem {
    /**
     * Intake.
     */
    
    CANSparkMax CANSparkMax = new CANSparkMax(12, MotorType.kBrushless);


    @Override
    public void initDefaultCommand() {
      // Set the default command for a subsystem here.
       setDefaultCommand(new PivotCmd(0));
    }
  
  
      public void update(double motorSpeed) {
        // Update motor speed to passed in value
        //System.out.println("pivot");
       // System.out.println(motorSpeed);

        CANSparkMax.setIdleMode(IdleMode.kBrake);
        CANSparkMax.set(motorSpeed);

        //System.out.print();
      }
      
      
  }


