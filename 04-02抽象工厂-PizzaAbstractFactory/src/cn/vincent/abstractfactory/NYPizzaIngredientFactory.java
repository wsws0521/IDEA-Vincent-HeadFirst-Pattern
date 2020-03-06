package cn.vincent.abstractfactory;

import cn.vincent.pojo.*;
/**
 * 
 * 方法说明：纽约pizza工厂
 * 
 * 创建时间：2019年3月13日下午2:37:53
 * @author Administrator-Vincent
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new DoughThinCrust();
	}

	@Override
	public Sauce createSauce() {
		return new SauceMarinara();
	}

	@Override
	public Cheese createCheese() {
		return new CheeseReggiano();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new VeggiesGarlic(), new VeggiesOnion(), new VeggiesMashroom(), new VeggiesRedpepper()};
		return veggies;
	}

	@Override
	public Peperoni createPeperoni() {
		return new PeperoniSliced();
	}

	@Override
	public Clams createClams() {
		return new ClamsFresh();
	}

}
