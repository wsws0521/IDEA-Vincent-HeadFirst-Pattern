package cn.vincent.test;

import java.rmi.*;

import cn.vincent.remote.service.MyRemote;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	public void go() {
		try {
			MyRemote service = (MyRemote)Naming.lookup( "rmi://127.0.0.1/RemoteHello" );
			String s  = service.SayHello();
			System.out.println(s);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
