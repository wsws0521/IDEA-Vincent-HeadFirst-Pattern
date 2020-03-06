package cn.vincent.test;

import cn.vincent.store.ChicagoPizzaStore;
import cn.vincent.store.NYPizzaStore;
import cn.vincent.store.PizzaStore;

public class Order {
	
	public static void main(String[] args) {
		// È¥¡¾Å¦Ô¼¡¿µê¶©¹º¡¾cheese¡¿ÅûÈø
		PizzaStore nyPizzaStore = new NYPizzaStore();
		nyPizzaStore.orderPizza("cheese");
		// È¥¡¾Ö¥¼Ó¸ç¡¿µê¶©¹º¡¾clam¡¿ÅûÈø
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		chicagoPizzaStore.orderPizza("clam");
	}
	
}
