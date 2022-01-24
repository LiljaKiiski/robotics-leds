// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.LEDSubsytem;

public class RainbowCommand extends CommandBase {
  
  public LEDSubsytem system;

  public RainbowCommand(LEDSubsytem system) {
    this.system = system;
    addRequirements(system);
  }

  @Override
  public void initialize() {
    system.setBaseColor(Constants.red);
  }

  @Override
  public void execute() {
      system.setBaseColor(Constants.red);
  }

  @Override
  public void end(boolean interrupted) {

  }
  
  @Override
  public boolean isFinished() {
    return false;
  }
}
