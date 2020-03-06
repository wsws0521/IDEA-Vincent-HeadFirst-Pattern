package cn.vincent.pizza;

import cn.vincent.abstractfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super();
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		//神奇，需要原料就向工厂索取
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
	}
}
