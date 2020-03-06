package cn.composite.menu;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator{
	Stack stack = new Stack();
	// �Ƚ�  ������ ���롰��ջ�����ݽṹ��
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	
	@Override
	public Object next() {
		if(hasNext()) {
			// �Ӷ�ջ��ȡ��Ŀǰ�ĵ����� ��ȡ������һԪ��
			Iterator iterator = (Iterator)stack.peek();
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			// ���Ԫ����һ���˵� ����������һ����Ҫ�������������е���� ���䶪���ջ
			if(menuComponent instanceof Menu) {
				stack.push(menuComponent.createIterator());
			}
			// ��������ǲ��ǲ˵� ���Ƕ����ظ����
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
			// ��ջ�Ķ�����ȡ��������
			Iterator iterator = (Iterator)stack.peek();
			if(!iterator.hasNext()) {
				// �õ���������ǿյ� �Ͱ����Ӷ�ջ�е���ȥ
				stack.pop();
				// �ݹ����
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
