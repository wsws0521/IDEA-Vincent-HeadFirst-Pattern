package cn.vincent.remote.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
// ��Ϊ��Զ�̷������  ��Ҫʵ��ĳЩԶ�̹���  �̳и�����
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	// ��Ϊ�׳�����쳣 ������Ҫ��д���๹����
	public MyRemoteImpl() throws RemoteException {
	}

	@Override
	public String SayHello() throws RemoteException {
		return "Server says : 'Hey!'";
	}

}
