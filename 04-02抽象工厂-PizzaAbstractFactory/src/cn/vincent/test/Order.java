package cn.vincent.test;

import cn.vincent.store.ChicagoPizzaStore;
import cn.vincent.store.NYPizzaStore;
import cn.vincent.store.PizzaStore;

public class Order {
	
	public static void main(String[] args) {
		// ȥ��ŦԼ���궩����cheese������
		PizzaStore nyPizzaStore = new NYPizzaStore();
		nyPizzaStore.orderPizza("cheese");
		// ȥ��֥�Ӹ硿�궩����clam������
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		chicagoPizzaStore.orderPizza("clam");
	}
	
}
