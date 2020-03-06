package cn.vincent.base.coffee;

import cn.vincent.base.Beverage;
/**
 * Ũ������
 * @author Vincent
 *
 */
public class Espresso extends Beverage {
	
	public Espresso() {
		description = "Espresso----Ũ������";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
