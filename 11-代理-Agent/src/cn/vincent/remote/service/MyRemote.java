package cn.vincent.remote.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * 
 * 接口说明：需要支持远程调用
 * 
 * 创建时间：2019年3月20日下午2:12:28
 * @author Administrator-Vincent
 */
public interface MyRemote extends Remote{
	// 网络运送的返回值类型 须为 原语类型/自己定义的类(实现了serializable) 可序列化的类
	String SayHello() throws RemoteException;
}
