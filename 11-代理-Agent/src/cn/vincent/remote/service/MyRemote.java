package cn.vincent.remote.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * 
 * �ӿ�˵������Ҫ֧��Զ�̵���
 * 
 * ����ʱ�䣺2019��3��20������2:12:28
 * @author Administrator-Vincent
 */
public interface MyRemote extends Remote{
	// �������͵ķ���ֵ���� ��Ϊ ԭ������/�Լ��������(ʵ����serializable) �����л�����
	String SayHello() throws RemoteException;
}
