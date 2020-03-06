package cn.vincent.menu;

import java.util.ArrayList;

import cn.vincent.iterator.HouseMenuIterator;
import cn.vincent.iterator.Iterator;
import cn.vincent.pojo.MenuItem;

public class HouseMenu {
	ArrayList<MenuItem> menuItems;

	public HouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("��ͥ���㽶", "��ͥ���㽶����", true, 12.99);
		addItem("��ͥ��ƻ����", "��ͥ��ƻ��������", true, 13.02);
		addItem("��ͥ��ţ��", "��ͥ��ţ������", false, 16.87);
		addItem("��ͥ������", "��ͥ����������", false, 15.23);
		// ��������������Ŀ
	}
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	// ʹ�õ�������д
	public Iterator createrIterator() {
		return new HouseMenuIterator(menuItems);
	}
}
