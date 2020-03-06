package cn.vincent.store;

import cn.vincent.pizza.Pizza;

public abstract class PizzaStore {
	/**
	 * 
	 * ����˵��������ͻ�����������public��
	 * 
	 * ���ߣ�Vincent
	 * ����ʱ�䣺2019��3��13������3:53:50
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
	 * ����˵�����ڲ����÷�����protected��
	 * 
	 * ���ߣ�Vincent
	 * ����ʱ�䣺2019��3��13������3:54:01
	 * @param type
	 * @return
	 */
	protected abstract Pizza createPizza(String type);
	
}
