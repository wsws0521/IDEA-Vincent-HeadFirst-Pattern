package cn.vincent.singleton;
/**
 * 
 * 类说明：单件模式：JVM【第一次】类加载，自觉把自己实例化出来（缺点：稍微没必要）
 * 
 * 创建时间：2019年3月13日下午7:57:29
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
