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
		addItem("�㽶", "�㽶����", true, 2.99);
		addItem("ƻ����", "ƻ��������", true, 3.02);
		addItem("ţ��", "ţ������", false, 6.87);
		addItem("����", "��������", true, 5.23);
		// ��������������Ŀ
	}
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("�Բ��𣬲˵��������޷���ӣ�");
		}else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems += 1;
		}
	}
//	public MenuItem[] getMenuItems() {
//		return menuItems;
//	}
	// ʹ�õ�������д
	public Iterator createrIterator() {
		return new DinnerMenuIterator(menuItems);
	}
	
	
}
