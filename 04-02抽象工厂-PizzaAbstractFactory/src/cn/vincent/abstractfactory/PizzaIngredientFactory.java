package cn.vincent.abstractfactory;

import cn.vincent.pojo.*;

/**
 * 
 * ����˵���������ӿڣ����𴴽�����ԭ��
 * 
 * ����ʱ�䣺2019��3��13������2:14:27
 * @author Administrator-Vincent
 */
public interface PizzaIngredientFactory {
	public Dough createDough();//����
	public Sauce createSauce();//����
	public Cheese createCheese();//֥ʿ
	public Veggies[] createVeggies();//�߲�
	public Peperoni createPeperoni();//������㳦
	public Clams createClams();//����
}
