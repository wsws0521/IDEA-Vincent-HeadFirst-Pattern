package cn.vincent.singleton;
/**
 * 
 * ��˵��������ģʽ����˫�ؼ����������ռ�����
 * 
 * ����ʱ�䣺2019��3��13������7:57:29
 * @author Administrator-Vincent
 */
public class Singleton3 {
	// volatile �����޳����ӷ���jdk1.5֮ǰ��������
	// ���ԡ�����������ֵ�����ܡ���ʱ�ᱻ����߳��޸ġ�
	// ʹ��volatile���εı����᡾ǿ�ƽ��޸ĵ�ֵ��������д�����桿
	// �����߱�ԭ���ԡ���ǿ�ƻ�ȡ������δ��������е�ֵ��д������
	private volatile static Singleton3 singleton;
	
	private Singleton3() {
	}
	// ������ʵ������á�ͬ����
	public static Singleton3 getInstance() {
		if(singleton == null) {
			// ����ͬ������
			synchronized (Singleton3.class) {
				// ����ͬ���󡿡��ٴμ�顿��δ�������̴߳���
				if(singleton == null) {
					singleton = new Singleton3();
				}
			}
		}
		return singleton;
	}
}
