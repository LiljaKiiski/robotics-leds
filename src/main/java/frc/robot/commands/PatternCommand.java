// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.LEDSubsytem;

public class PatternCommand extends CommandBase {
  
  public LEDSubsytem system;

  public PatternCommand(LEDSubsytem system) {
    this.system = system;
    addRequirements(system);
  }

  @Override
  public void initialize() {
      
  }

  @Override
  public void execute() {
      
  }

  @Override
  public void end(boolean interrupted) {

  }
  
  @Override
  public boolean isFinished() {
    return false;
  }
}
