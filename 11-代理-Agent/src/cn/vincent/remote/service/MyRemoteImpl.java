package cn.vincent.remote.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
// 因为是远程服务对象  需要实现某些远程功能  继承更方便
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	// 因为抛出这个异常 子类需要重写父类构造器
	public MyRemoteImpl() throws RemoteException {
	}

	@Override
	public String SayHello() throws RemoteException {
		return "Server says : 'Hey!'";
	}

}
