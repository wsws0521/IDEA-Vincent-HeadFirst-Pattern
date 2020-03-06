package cn.vincent.store;

import cn.vincent.abstractfactory.NYPizzaIngredientFactory;
import cn.vincent.abstractfactory.PizzaIngredientFactory;
import cn.vincent.pizza.CheesePizza;
import cn.vincent.pizza.ClamPizza;
import cn.vincent.pizza.Pizza;
import cn.vincent.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		// 【纽约披萨店】，引入【纽约工厂】
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if(type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York style cheese pizza");
		}else if(type.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York style veggie pizza");
		}else if(type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York style clam pizza");
		}else {
			
		}
		return pizza;
	}

}
