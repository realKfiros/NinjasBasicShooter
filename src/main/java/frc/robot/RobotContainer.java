package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.subsystems.Shooter;
import frc.robot.commands.Shoot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;

public class RobotContainer {
  // Subsystems
  private final Shooter m_shooter;

  // Commands
  private final Shoot m_shoot;
  
  // Other
  private final CommandPS4Controller m_joystick;
  
  public RobotContainer() { 
    m_joystick = new CommandPS4Controller(OperatorConstants.kDriverControllerPort);

    m_shooter = new Shooter();
    m_shoot = new Shoot(m_joystick, m_shooter);

    m_shooter.setDefaultCommand(m_shoot);
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
