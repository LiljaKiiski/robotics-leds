// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.InfoManagerSubsystem;

public class SendInformationCommand extends CommandBase {
  
  InfoManagerSubsystem infoManager;
  boolean sentMessage;
  byte[] info;

  public SendInformationCommand(InfoManagerSubsystem infoManager, byte[] info) {
    this.infoManager = infoManager;
    this.info = info;

  }

  @Override
  public void initialize() {
    //Send message
    infoManager.sendMessage(info);
    sentMessage = true;
  }

  @Override
  public void execute() {

  }

  @Override
  public void end(boolean interrupted) {
    
  }

  @Override
  public boolean isFinished() {
    return sentMessage;
  }
}
