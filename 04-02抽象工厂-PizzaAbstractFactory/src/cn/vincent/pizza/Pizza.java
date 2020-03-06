package cn.vincent.pizza;

import cn.vincent.pojo.*;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Peperoni peperoni;
	Clams clam;
	// 仅【prepare】方法需要改变
	public abstract void prepare();
	
	public void bake() {
		System.out.println("bake for 25 minutes at 350");
	}
	public void cut() {
		System.out.println("cut pizza into diagonal slices");
	}
	public void box() {
		System.out.println("put pizza into official pizzastore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		// 打印pizza
		return null;
	}
}
