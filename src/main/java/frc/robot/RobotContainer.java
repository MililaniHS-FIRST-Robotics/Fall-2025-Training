// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.nio.channels.Pipe;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Commands.pivotCommand;
import frc.robot.Subsystems.pivotSubsystem;

public class RobotContainer {
  private pivotSubsystem pivotSubsystem = new pivotSubsystem();
  private GenericHID controller0 = new GenericHID(0);
  private GenericHID controller1 = new GenericHID(1);



  public RobotContainer() {
    configureBindings();
  }



  private void configureBindings() {
    new JoystickButton(controller0, Constants.GamepadConstants.kAButtonPort)
    .onTrue(new pivotCommand(pivotSubsystem, controller0));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
