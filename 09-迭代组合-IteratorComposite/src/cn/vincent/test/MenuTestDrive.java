package cn.vincent.test;

import cn.vincent.menu.DinerMenu;
import cn.vincent.menu.HouseMenu;
import cn.vincent.waitress.Waitress;

public class MenuTestDrive {
	public static void main(String[] args) {
		HouseMenu houseMenu = new HouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(houseMenu, dinerMenu);
		waitress.printMenu();
	}
}
