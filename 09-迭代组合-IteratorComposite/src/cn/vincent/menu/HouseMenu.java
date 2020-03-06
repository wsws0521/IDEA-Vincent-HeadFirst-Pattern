package cn.vincent.menu;

import java.util.ArrayList;

import cn.vincent.iterator.HouseMenuIterator;
import cn.vincent.iterator.Iterator;
import cn.vincent.pojo.MenuItem;

public class HouseMenu {
	ArrayList<MenuItem> menuItems;

	public HouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("家庭·香蕉", "家庭·香蕉描述", true, 12.99);
		addItem("家庭·苹果酱", "家庭·苹果酱描述", true, 13.02);
		addItem("家庭·牛肉", "家庭·牛肉描述", false, 16.87);
		addItem("家庭·猪肉", "家庭·猪肉描述", false, 15.23);
		// 继续加入其他项目
	}
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	// 使用迭代器改写
	public Iterator createrIterator() {
		return new HouseMenuIterator(menuItems);
	}
}
