package cn.vincent.iterator;

import cn.vincent.pojo.MenuItem;

public class DinnerMenuIterator implements Iterator{
	MenuItem[] items;
	int position = 0;
	public DinnerMenuIterator(MenuItem[] items) {
		super();
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position += 1;
		return menuItem;
	}
//	//�����java.util��������������ӿڷ���
//	public void remove() {
//		if(position <= 0) {
//			throw new IllegalStateException("������е�һ�ε���֮ǰ�޷�ɾ����");
//		}
//		if(items[position] != null) {
//			for(int i = position-1; i < (items.length-1); i ++) {
//				items[i] = items[i+1];
//			}
//			items[items.length-1] = null;
//		}
//	}
}
