package cn.vincent.store;

import cn.vincent.factory.SimplePizzaFactory;
import cn.vincent.pizza.Pizza;
/**
 * 简单工厂，算不上设计模式，只是一种编程习惯
 * @author Administrator
 *
 */
public class PizzaStore {
	// new的动作被移送到了工厂中，封装，使得代码“对修改关闭”
	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		super();
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
