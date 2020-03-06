package cn.vincent.abstractfactory;

import cn.vincent.pojo.*;
/**
 * 
 * 方法说明：芝加哥pizza工厂
 * 
 * 创建时间：2019年3月13日下午2:55:47
 * @author Administrator-Vincent
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new DoughThickCrust();
	}

	@Override
	public Sauce createSauce() {
		return new SaucePlumtomato();
	}

	@Override
	public Cheese createCheese() {
		return new CheeseMozzarella();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new VeggiesEggplant(), new VeggiesBlackolives(), new VeggiesSpinach()};
		return veggies;
	}

	@Override
	public Peperoni createPeperoni() {
		return new PeperoniSliced();
	}

	@Override
	public Clams createClams() {
		return new ClamsFrozn();
	}

}
