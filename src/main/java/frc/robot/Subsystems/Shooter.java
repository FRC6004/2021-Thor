/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/


package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.Commands.*;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.ctre.phoenix.motorcontrol.NeutralMode;


/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class Shooter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    WPI_VictorSPX VictorSPX = new WPI_VictorSPX(RobotMap.SHOOTER);
    

    public Shooter() {
        //VictorSPX.setNeutralMode(NeutralMode.Brake);
    }

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ShooterCmd());
    }
  
  
      public void update(double motorSpeed) {
        // Update motor speed to passed in value
        //System.out.print(motorSpeed);
        VictorSPX.setNeutralMode(NeutralMode.Brake);
        VictorSPX.set(motorSpeed);
        //System.out.print();
      }
      
      
  }

