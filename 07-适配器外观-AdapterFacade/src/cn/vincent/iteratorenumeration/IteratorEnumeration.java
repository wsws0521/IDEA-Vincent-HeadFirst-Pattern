package cn.vincent.iteratorenumeration;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 
 * 类说明：旧世界 去适配 新世界
 * 旧世界的【枚举器】Enumeration
 * 新世界的【迭代器】Iterator
 * 
 * 创建时间：2019年3月14日下午4:17:50
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
