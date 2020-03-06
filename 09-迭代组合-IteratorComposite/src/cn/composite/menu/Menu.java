package cn.composite.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	ArrayList menuComponents = new ArrayList();
	String name;
	String description;
	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);;
	}
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);;
	}
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public void print() {
		System.out.println("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		// java.util迭代器
		Iterator iterator = menuComponents.iterator();
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
	@Override
	public Iterator createIterator() {
		// 这个自己新写的CompositeIterator迭代器，知道如何遍历任何组合
		return new CompositeIterator(menuComponents.iterator());
	}
}
