package cn.vincent.singleton;
/**
 * 
 * 类说明：单件模式：【双重检查加锁】，终极方案
 * 
 * 创建时间：2019年3月13日下午7:57:29
 * @author Administrator-Vincent
 */
public class Singleton3 {
	// volatile 反复无常、挥发，jdk1.5之前备受争议
	// 用以【声明变量的值】可能【随时会被别的线程修改】
	// 使用volatile修饰的变量会【强制将修改的值】【立即写入主存】
	// 【不具备原子性】，强制获取其他【未完成事务】中的值，写入主存
	private volatile static Singleton3 singleton;
	
	private Singleton3() {
	}
	// 对外访问点中少用【同步】
	public static Singleton3 getInstance() {
		if(singleton == null) {
			// 进入同步区块
			synchronized (Singleton3.class) {
				// 【进同步后】【再次检查】其未被其他线程创建
				if(singleton == null) {
					singleton = new Singleton3();
				}
			}
		}
		return singleton;
	}
}
