package cn.vincent.iteratorenumeration;

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
public class IteratorEnumeration implements Enumeration {
	Iterator iterator;
	
	public IteratorEnumeration(Iterator iterator) {
		super();
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public Object nextElement() {
		return iterator.next();
	}

	
	
}
