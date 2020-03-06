package cn.vincent.store;

import cn.vincent.factory.SimplePizzaFactory;
import cn.vincent.pizza.Pizza;
/**
 * �򵥹������㲻�����ģʽ��ֻ��һ�ֱ��ϰ��
 * @author Administrator
 *
 */
public class PizzaStore {
	// new�Ķ��������͵��˹����У���װ��ʹ�ô��롰���޸Ĺرա�
	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		super();
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
