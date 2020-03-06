package cn.vincent.waitress;

import cn.vincent.iterator.Iterator;
import cn.vincent.menu.DinerMenu;
import cn.vincent.menu.HouseMenu;
import cn.vincent.pojo.MenuItem;

public class Waitress {
	HouseMenu houseMenu;
	DinerMenu dinerMenu;
	public Waitress(HouseMenu houseMenu, DinerMenu dinerMenu) {
		super();
		this.houseMenu = houseMenu;
		this.dinerMenu = dinerMenu;
	}
	public void printMenu() {
		Iterator houseIterator = houseMenu.createrIterator();
		Iterator dinerIterator = dinerMenu.createrIterator();
		System.out.println("Menu\n------------\nHouse");
		printMenu(houseIterator);
		System.out.println("Menu\n------------\nDiner");
		printMenu(dinerIterator);
	}
	public void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			// ��Ҳ����д����ѭ���ˡ�����ѭ��������Ҳ����ע������
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName() + ",");
			System.out.println(menuItem.getPrice() + "--");
			System.out.println(menuItem.getDescription());
		}
	}
}
