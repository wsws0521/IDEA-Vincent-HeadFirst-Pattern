package cn.vincent.pojo;
/**
 * 
 * 类说明：音响
 * 
 * 创建时间：2019年3月14日上午11:41:51
 * @author Administrator-Vincent
 */
public class Stereo {
	
	public void off() {
		System.out.println("Stereo is off");
	}
	
	public void on() {
		System.out.println("Stereo is on");
	}
	public void setCD() {
		System.out.println("Stereo CD is put in");
	}
	public void setVolume(int i) {
		System.out.println("Stereo volume is set at " + i);
	}
}
