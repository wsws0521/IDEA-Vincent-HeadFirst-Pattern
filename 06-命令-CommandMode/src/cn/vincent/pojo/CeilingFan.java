package cn.vincent.pojo;
/**
 * 
 * ��˵��������
 * 
 * ����ʱ�䣺2019��3��14������2:00:27
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
	public void off() { this.speed = OFF; System.out.println(location + "  ִ�з����ٶȵ��رգ�" + speed);}
	public void low() { this.speed = LOW; System.out.println(location + "  ִ�з����ٶȵ����٣�" + speed);}
	public void medium() { this.speed = MEDIUM; System.out.println(location + "  ִ�з����ٶȵ����٣�" + speed);}
	public void high() { this.speed = HIGH; System.out.println(location + "  ִ�з����ٶȵ����٣�" + speed);}
	public int getSpeed() {
		return speed;
	}
}
