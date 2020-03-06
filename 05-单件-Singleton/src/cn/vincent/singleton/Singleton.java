package cn.vincent.singleton;
/**
 * 
 * 类说明：单件模式：【单件对象】比【静态变量】更有用
 * 
 * 创建时间：2019年3月13日下午7:57:29
 * @author Administrator-Vincent
 */
public class Singleton {
	private static Singleton singleton;
	// 将构造器 私有化，不允许别人通过构造实例化本对象,只允许自己实例化自己
	private Singleton() {
	}
	/**
	 * 
	 * 方法说明：提供一个全局访问点
	 * 
	 * 作者：Vincent
	 * 创建时间：2019年3月13日下午7:59:51
	 * @return
	 */
	// 静态方法：无需实例化对象，可直接             类名.方法()
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
