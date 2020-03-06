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
		//神奇，需要原料就向工厂索取
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		veggies = pizzaIngredientFactory.createVeggies();
	}
}
