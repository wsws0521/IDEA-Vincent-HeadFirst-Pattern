package cn.vincent.test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

import cn.vincent.remote.service.*;

public class RegisterTest {
	public static void main(String[] args) throws MalformedURLException {
		try {
			MyRemote service = new MyRemoteImpl();
			// Ϊ��������
			// �󶨺� RMJ ��ѷ��񻻳� Stub ����  Registry ��
			Naming.rebind("RemoteHello", service);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
