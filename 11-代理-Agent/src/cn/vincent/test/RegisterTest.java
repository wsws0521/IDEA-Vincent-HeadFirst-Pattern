package cn.vincent.test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

import cn.vincent.remote.service.*;

public class RegisterTest {
	public static void main(String[] args) throws MalformedURLException {
		try {
			MyRemote service = new MyRemoteImpl();
			// 为服务命名
			// 绑定后 RMJ 会把服务换成 Stub 放在  Registry 中
			Naming.rebind("RemoteHello", service);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
