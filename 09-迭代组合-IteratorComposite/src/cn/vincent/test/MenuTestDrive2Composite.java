package cn.vincent.test;

import cn.composite.menu.Menu;
import cn.composite.menu.MenuComponent;
import cn.composite.menu.MenuItem;
import cn.composite.menu.Waitress;


public class MenuTestDrive2Composite {
	public static void main(String[] args) {
		MenuComponent houseMenu = new Menu("House Menu", "���");
		MenuComponent lunchMenu = new Menu("Lunch Menu", "���");
		MenuComponent dinerMenu = new Menu("Diner Menu", "���");
		MenuComponent dessertMenu = new Menu("Desser tMenu", "���");
		
		MenuComponent allMenu = new Menu("All Menus", "�˵�����");
		allMenu.add(houseMenu);
		allMenu.add(lunchMenu);
		allMenu.add(dinerMenu);
		
		// Ψÿ�ٷ���Ӳ˵�
		// �緹
		houseMenu.add(new MenuItem("���ܲ�", "����-���ܲ����߲�", true, 3.89));
		houseMenu.add(dessertMenu); // �����ƽ�������ǡ��˵�Ԫ�ء�
		dessertMenu.add(new MenuItem("С���", "����-С��������", true, 3.89));
		// �緹
		lunchMenu.add(new MenuItem("����", "����-����", false, 13.23));
		// ��
		dinerMenu.add(new MenuItem("��Ϳ", "����-��Ϳ", true, 13.23));
		
		Waitress waitress = new Waitress(allMenu);
		waitress.printMenu();
		waitress.printVegetarianMenu();
	}
}
