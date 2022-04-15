// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.LEDPatterns;

public class LEDSubsytem extends SubsystemBase {
  AddressableLEDBuffer buffer;
  AddressableLED led;

  public LEDPatterns patterns;

  //Constructor
  public LEDSubsytem() {
    led = new AddressableLED(0);
    buffer = new AddressableLEDBuffer(120);
    patterns = new LEDPatterns(buffer, led);

    led.setLength(buffer.getLength());
    led.setData(buffer);
    led.start();

    //patterns.gradient(0, buffer.getLength()/2, Constants.purple, Constants.yellow);
    //patterns.gradient(buffer.getLength()/2, buffer.getLength(), Constants.yellow, Constants.purple);
    //patterns.mvrt_pattern();
    //patterns.morse_code();

    Timer.delay(1);
  }

  public void stop(){
    led.stop();
  }

  @Override
  public void periodic() {
    patterns.clap();
    patterns.setData();
    //patterns.move_leds();
    //patterns.setData();
    Timer.delay(1);
  }
}