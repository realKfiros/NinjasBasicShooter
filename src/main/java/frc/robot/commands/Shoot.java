package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;
import frc.robot.Constants.ShooterConstants;
import frc.robot.subsystems.Shooter;

public class Shoot extends CommandBase {
  private Shooter m_shooter;
  private CommandPS4Controller m_joystick;

  public Shoot(CommandPS4Controller joystick, Shooter shooter) {
    m_shooter = shooter; 
    m_joystick = joystick;

    addRequirements(m_shooter);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    double speed = -m_joystick.getLeftY() * ShooterConstants.kSpeedMul /* * Time.deltaTime😂 */;
    
    speed = (speed > 0) ? 0 : speed;

    m_shooter.setSpeed(speed);
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
