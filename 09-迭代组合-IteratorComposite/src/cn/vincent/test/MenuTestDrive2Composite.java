package cn.vincent.test;

import cn.composite.menu.Menu;
import cn.composite.menu.MenuComponent;
import cn.composite.menu.MenuItem;
import cn.composite.menu.Waitress;


public class MenuTestDrive2Composite {
	public static void main(String[] args) {
		MenuComponent houseMenu = new Menu("House Menu", "Ôç²Í");
		MenuComponent lunchMenu = new Menu("Lunch Menu", "Îç²Í");
		MenuComponent dinerMenu = new Menu("Diner Menu", "Íí²Í");
		MenuComponent dessertMenu = new Menu("Desser tMenu", "Ìğµã");
		
		MenuComponent allMenu = new Menu("All Menus", "²Ëµ¥¼¯ºÏ");
		allMenu.add(houseMenu);
		allMenu.add(lunchMenu);
		allMenu.add(dinerMenu);
		
		// Î¨Ã¿¶Ù·¹Ìí¼Ó²Ëµ¥
		// Ôç·¹
		houseMenu.add(new MenuItem("ºúÂÜ²·", "ÃèÊö-ºúÂÜ²·ÊÇÊß²Ë", true, 3.89));
		houseMenu.add(dessertMenu); // ¿ÉÌí¼ÓÆ½¼¶£¬¶¼ÊÇ¡¶²Ëµ¥ÔªËØ¡·
		dessertMenu.add(new MenuItem("Ğ¡Ãæ°ü", "ÃèÊö-Ğ¡Ãæ°üÊÇÌğµã", true, 3.89));
		// Îç·¹
		lunchMenu.add(new MenuItem("ÖíÈâ", "ÃèÊö-ÖíÈâ", false, 13.23));
		// Íí·¹
		dinerMenu.add(new MenuItem("ºıÍ¿", "ÃèÊö-ºıÍ¿", true, 13.23));
		
		Waitress waitress = new Waitress(allMenu);
		waitress.printMenu();
		waitress.printVegetarianMenu();
	}
}
