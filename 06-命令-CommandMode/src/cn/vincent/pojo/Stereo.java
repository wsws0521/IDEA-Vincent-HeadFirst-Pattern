package cn.vincent.pojo;
/**
 * 
 * ��˵��������
 * 
 * ����ʱ�䣺2019��3��14������11:41:51
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
