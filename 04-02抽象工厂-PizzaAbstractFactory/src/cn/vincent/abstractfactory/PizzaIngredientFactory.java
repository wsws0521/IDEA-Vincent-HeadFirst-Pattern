package cn.vincent.abstractfactory;

import cn.vincent.pojo.*;

/**
 * 
 * 方法说明：工厂接口，负责创建所有原料
 * 
 * 创建时间：2019年3月13日下午2:14:27
 * @author Administrator-Vincent
 */
public interface PizzaIngredientFactory {
	public Dough createDough();//面团
	public Sauce createSauce();//酱油
	public Cheese createCheese();//芝士
	public Veggies[] createVeggies();//蔬菜
	public Peperoni createPeperoni();//意大利香肠
	public Clams createClams();//蛤蜊
}
