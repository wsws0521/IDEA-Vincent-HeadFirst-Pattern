package cn.vincent.enumerationiterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 
 * 类说明：新世界 去适配 老世界
 * 旧世界的【枚举器】Enumeration
 * 新世界的【迭代器】Iterator
 * 
 * 创建时间：2019年3月14日下午4:17:50
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
	// 枚举 属于 【只读】 接口，不支持删除（迭代器好像也不支持的吧）
	// 迭代器 未雨绸缪，事先准备了该异常
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
}
