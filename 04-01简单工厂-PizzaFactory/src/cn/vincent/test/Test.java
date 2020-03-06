package cn.vincent.test;

import cn.vincent.factory.SimplePizzaFactory;
import cn.vincent.store.PizzaStore;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplePizzaFactory SimplePizzaFactory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(SimplePizzaFactory);
		pizzaStore.orderPizza("C");
	}

}
