package cn.vincent.iterator;
/**
 * 
 * 类说明：迭代器接口
 * 
 * 创建时间：2019年3月16日下午1:16:57
 * @author Administrator-Vincent
 */
public interface Iterator {
	boolean hasNext();
	Object next();
	// 加上这个就是java.util里的Iterator
//	void remove();
}
