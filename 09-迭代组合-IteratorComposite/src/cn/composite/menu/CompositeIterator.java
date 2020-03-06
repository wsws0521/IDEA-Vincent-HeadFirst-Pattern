package cn.composite.menu;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator{
	Stack stack = new Stack();
	// 先将  迭代器 放入“堆栈”数据结构中
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	
	@Override
	public Object next() {
		if(hasNext()) {
			// 从堆栈中取出目前的迭代器 再取它的下一元素
			Iterator iterator = (Iterator)stack.peek();
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			// 如果元素是一个菜单 我们有了另一个需要被包含进遍历中的组合 将其丢入堆栈
			if(menuComponent instanceof Menu) {
				stack.push(menuComponent.createIterator());
			}
			// 不管组件是不是菜单 我们都返回该组件
			return menuComponent;
		}else {
			return null;
		}
	}
	
	@Override
	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		}else {
			// 堆栈的顶层中取出迭代器
			Iterator iterator = (Iterator)stack.peek();
			if(!iterator.hasNext()) {
				// 该迭代器如果是空的 就把它从堆栈中弹出去
				stack.pop();
				// 递归调用
				return hasNext();
			}else {
				return true;
			}
		}
	}

		
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
//	public void testCompositeIterator(MenuComponent component) {
//		CompositeIterator iterator = new CompositeIterator(component.iterator());
//		while(iterator.hasNext()) {
//			MenuComponent component = iterator.next();
//		}
//	}
}
