package cn.vincent.base.coffee;

import cn.vincent.base.Beverage;
/**
 * Å¨Ëõ¿§·È
 * @author Vincent
 *
 */
public class Espresso extends Beverage {
	
	public Espresso() {
		description = "Espresso----Å¨Ëõ¿§·È";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
