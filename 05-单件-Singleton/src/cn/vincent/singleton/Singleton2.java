package cn.vincent.singleton;
/**
 * 
 * ��˵��������ģʽ��JVM����һ�Ρ�����أ��Ծ����Լ�ʵ����������ȱ�㣺��΢û��Ҫ��
 * 
 * ����ʱ�䣺2019��3��13������7:57:29
 * @author Administrator-Vincent
 */
public class Singleton2 {
	private static Singleton2 singleton = new Singleton2();
	
	private Singleton2() {
	}
	
	public static synchronized Singleton2 getInstance() {
		return singleton;
	}
}
