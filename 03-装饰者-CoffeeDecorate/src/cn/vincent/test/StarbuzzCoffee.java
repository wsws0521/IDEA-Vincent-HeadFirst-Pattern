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
		//��Mochaװ��һ��
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
		//��Mocha��װ��һ��
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
	}
}
