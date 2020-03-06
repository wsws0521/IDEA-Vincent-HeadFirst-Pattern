package cn.vincent.pojo;
/**
 * 
 * 类说明：吊扇
 * 
 * 创建时间：2019年3月14日下午2:00:27
 * @author Administrator-Vincent
 */
public class CeilingFan {
	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	String location;
	int speed;
	public CeilingFan(String location) {
		super();
		this.location = location;
	}
	public void off() { this.speed = OFF; System.out.println(location + "  执行风扇速度到关闭：" + speed);}
	public void low() { this.speed = LOW; System.out.println(location + "  执行风扇速度到低速：" + speed);}
	public void medium() { this.speed = MEDIUM; System.out.println(location + "  执行风扇速度到中速：" + speed);}
	public void high() { this.speed = HIGH; System.out.println(location + "  执行风扇速度到高速：" + speed);}
	public int getSpeed() {
		return speed;
	}
}
