package cn.vincent.iterator;

import java.util.ArrayList;

import cn.vincent.pojo.MenuItem;

public class HouseMenuIterator implements Iterator{
	ArrayList<MenuItem> menuItems;
	int position = 0;
	public HouseMenuIterator(ArrayList<MenuItem> items) {
		super();
		this.menuItems = items;
	}

	@Override
	public boolean hasNext() {
		if(position >= menuItems.size() || menuItems.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems.get(position);
		position += 1;
		return menuItem;
	}

}
