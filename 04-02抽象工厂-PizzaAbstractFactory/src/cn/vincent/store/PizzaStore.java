package cn.vincent.store;

import cn.vincent.pizza.Pizza;

public abstract class PizzaStore {
	/**
	 * 
	 * 方法说明：面向客户订单公开（public）
	 * 
	 * 作者：Vincent
	 * 创建时间：2019年3月13日下午3:53:50
	 * @param type
	 * @return
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	/**
	 * 
	 * 方法说明：内部调用方法（protected）
	 * 
	 * 作者：Vincent
	 * 创建时间：2019年3月13日下午3:54:01
	 * @param type
	 * @return
	 */
	protected abstract Pizza createPizza(String type);
	
}
