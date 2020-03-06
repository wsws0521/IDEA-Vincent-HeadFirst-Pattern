package cn.vincent.factory;

import cn.vincent.pizza.Apizza;
import cn.vincent.pizza.Bpizza;
import cn.vincent.pizza.Cpizza;
import cn.vincent.pizza.Pizza;

public class SimplePizzaFactory {
	public Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		if(pizzaType.equals("A")) {
			pizza = new Apizza();
		}else if(pizzaType.equals("B")) {
			pizza = new Bpizza();
		}else if(pizzaType.equals("C")) {
			pizza = new Cpizza();
		}
		return pizza;
	}
}
