// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.networktables.GenericEntry;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Commands.PivotCommand;
import frc.robot.Subsystems.PivotSubsystem;

public class RobotContainer {
  //create the instance of the subsystem 
  private PivotSubsystem pivotSubsystem = new PivotSubsystem();
  private GenericHID controller0 = new GenericHID(0);
  private GenericHID controller1 = new GenericHID(1);


  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    //Put your buttons
    new JoystickButton(controller0, Constants.GamepadConstants.kAButtonPort)
    .onTrue(new PivotCommand(pivotSubsystem, controller0));












  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
