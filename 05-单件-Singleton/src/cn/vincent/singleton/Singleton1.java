package cn.vincent.singleton;
/**
 * 
 * ��˵��������ģʽ���������һ�Ρ������̡߳�ͬʱ���ø���
 * 
 * ����ʱ�䣺2019��3��13������7:57:29
 * @author Administrator-Vincent
 */
public class Singleton1 {
	private static Singleton1 singleton;
	
	private Singleton1() {
	}
	// ��ͬ����,���ǵ��µ�һ��֮��ÿ�η��ʸ÷�����Ҫ�Ŷӵȴ���ȱ�㣺���ܽ���100��
	public static synchronized Singleton1 getInstance() {
		if(singleton == null) {
			singleton = new Singleton1();
		}
		return singleton;
	}
}
