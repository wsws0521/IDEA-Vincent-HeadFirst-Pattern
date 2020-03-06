package cn.vincent.singleton;
/**
 * 
 * 类说明：单件模式：解决【第一次】【多线程】同时调用该类
 * 
 * 创建时间：2019年3月13日下午7:57:29
 * @author Administrator-Vincent
 */
public class Singleton1 {
	private static Singleton1 singleton;
	
	private Singleton1() {
	}
	// 【同步】,但是导致第一次之后每次访问该方法都要排队等待，缺点：性能降低100倍
	public static synchronized Singleton1 getInstance() {
		if(singleton == null) {
			singleton = new Singleton1();
		}
		return singleton;
	}
}
