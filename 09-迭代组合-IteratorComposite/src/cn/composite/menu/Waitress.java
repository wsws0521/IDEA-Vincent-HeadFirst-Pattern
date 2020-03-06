package cn.composite.menu;

import java.util.Iterator;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		super();
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator iterator = allMenus.createIterator();
		System.out.println("\nÀÿ ≥≤Àµ•£∫\n--------");
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			try {
				if(menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {	}
		}
		
		
	}
}
