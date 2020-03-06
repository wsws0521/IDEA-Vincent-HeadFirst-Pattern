package cn.vincent.singleton;
/**
 * 
 * ��˵��������ģʽ�����������󡿱ȡ���̬������������
 * 
 * ����ʱ�䣺2019��3��13������7:57:29
 * @author Administrator-Vincent
 */
public class Singleton {
	private static Singleton singleton;
	// �������� ˽�л������������ͨ������ʵ����������,ֻ�����Լ�ʵ�����Լ�
	private Singleton() {
	}
	/**
	 * 
	 * ����˵�����ṩһ��ȫ�ַ��ʵ�
	 * 
	 * ���ߣ�Vincent
	 * ����ʱ�䣺2019��3��13������7:59:51
	 * @return
	 */
	// ��̬����������ʵ�������󣬿�ֱ��             ����.����()
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
