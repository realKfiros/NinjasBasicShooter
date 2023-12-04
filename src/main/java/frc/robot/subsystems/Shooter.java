package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConstants;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Shooter extends SubsystemBase {
  private CANSparkMax m_rightMotor;
  private CANSparkMax m_leftMotor;

  public Shooter() {
    m_rightMotor = new CANSparkMax(ShooterConstants.kRightShooter, MotorType.kBrushless);
    m_leftMotor = new CANSparkMax(ShooterConstants.kLeftShooter, MotorType.kBrushless);
  }

  public void setSpeed(double speed){
      m_leftMotor.set(speed);
      m_rightMotor.set(speed);
  }
}
