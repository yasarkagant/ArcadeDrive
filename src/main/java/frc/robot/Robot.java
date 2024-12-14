package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;


public class Robot extends TimedRobot {
  private final PWMSparkMax m_leftMotor = new PWMSparkMax(11);
  private final PWMSparkMax m_rightMotor = new PWMSparkMax(12);
  private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);
  private final Joystick m_driverController = new Joystick(0);



  @Override
  public void robotInit() {
    m_rightMotor.setInverted(true);
  }

  @Override
  public void teleopPeriodic() {
    m_robotDrive.arcadeDrive(m_driverController.getRawAxis(1), -m_driverController.getRawAxis(4));
  }
}
