package cn.vincent.enumerationiterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 
 * ��˵���������� ȥ���� ������
 * ������ġ�ö������Enumeration
 * ������ġ���������Iterator
 * 
 * ����ʱ�䣺2019��3��14������4:17:50
 * @author Administrator-Vincent
 */
public class EnumerationIterator implements Iterator {
	Enumeration enumeration;
	
	public EnumerationIterator(Enumeration enumeration) {
		super();
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}
	// ö�� ���� ��ֻ���� �ӿڣ���֧��ɾ��������������Ҳ��֧�ֵİɣ�
	// ������ δ����ѣ�����׼���˸��쳣
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
}
