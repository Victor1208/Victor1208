
public class Drivetrain extends Subsystem{
private CANTalon masterTalon;
private CANTalon slaveTalon;


}
public Drivetrain ()
{masterTalon= new CANTalon(RobotMap.DRIVE_MASTER_PORT);
slaveTalon= new CANTalon(RobotMap.DRIVE_SLAVE_PORT);
}
public void forward()
{masterTalon.set(0.1);
}public void backward()
{masterTalon.set(-0.1);
public void stop()
{masterTalon.set(0);

}
}
public 