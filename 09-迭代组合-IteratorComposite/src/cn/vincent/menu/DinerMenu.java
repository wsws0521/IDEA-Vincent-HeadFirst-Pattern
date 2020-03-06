package cn.vincent.menu;

import cn.vincent.iterator.DinnerMenuIterator;
import cn.vincent.iterator.Iterator;
import cn.vincent.pojo.MenuItem;

public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("香蕉", "香蕉描述", true, 2.99);
		addItem("苹果酱", "苹果酱描述", true, 3.02);
		addItem("牛肉", "牛肉描述", false, 6.87);
		addItem("猪肉", "猪肉描述", true, 5.23);
		// 继续加入其他项目
	}
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("对不起，菜单已满，无法添加！");
		}else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems += 1;
		}
	}
//	public MenuItem[] getMenuItems() {
//		return menuItems;
//	}
	// 使用迭代器改写
	public Iterator createrIterator() {
		return new DinnerMenuIterator(menuItems);
	}
	
	
}
