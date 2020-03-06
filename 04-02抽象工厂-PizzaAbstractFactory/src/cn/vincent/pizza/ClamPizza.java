package cn.vincent.pizza;

import cn.vincent.abstractfactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super();
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		//���棬��Ҫԭ�Ͼ��򹤳���ȡ
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
		clam = pizzaIngredientFactory.createClams();
	}
}
