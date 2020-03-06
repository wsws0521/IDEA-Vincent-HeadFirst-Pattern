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
//	//这就是java.util里面迭代器完整接口方法
//	public void remove() {
//		if(position <= 0) {
//			throw new IllegalStateException("在你进行第一次迭代之前无法删除！");
//		}
//		if(items[position] != null) {
//			for(int i = position-1; i < (items.length-1); i ++) {
//				items[i] = items[i+1];
//			}
//			items[items.length-1] = null;
//		}
//	}
}
