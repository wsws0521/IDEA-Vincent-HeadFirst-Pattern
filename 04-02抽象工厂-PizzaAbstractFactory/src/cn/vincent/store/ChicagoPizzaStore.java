package cn.vincent.store;

import cn.vincent.abstractfactory.ChicagoPizzaIngredientFactory;
import cn.vincent.abstractfactory.PizzaIngredientFactory;
import cn.vincent.pizza.CheesePizza;
import cn.vincent.pizza.ClamPizza;
import cn.vincent.pizza.Pizza;
import cn.vincent.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		// 【芝加哥披萨店】，引入【芝加哥工厂】
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		if(type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago style cheese pizza");
		}else if(type.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago style veggie pizza");
		}else if(type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago style clam pizza");
		}else {
			
		}
		return pizza;
	}

}
