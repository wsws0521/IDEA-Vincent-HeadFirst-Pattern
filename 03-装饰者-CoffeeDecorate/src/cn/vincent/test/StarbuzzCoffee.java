package cn.vincent.test;

import cn.vincent.base.Beverage;
import cn.vincent.base.coffee.Espresso;
import cn.vincent.base.coffee.HouseBlend;
import cn.vincent.decorate.dressing.Mocha;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + "$" + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		//用Mocha装饰一次
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
		//用Mocha再装饰一次
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
	}
}
