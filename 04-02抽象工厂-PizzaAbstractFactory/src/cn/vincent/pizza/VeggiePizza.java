package cn.vincent.pizza;

import cn.vincent.abstractfactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super();
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		//���棬��Ҫԭ�Ͼ��򹤳���ȡ
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		veggies = pizzaIngredientFactory.createVeggies();
	}
}
