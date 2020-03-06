package cn.vincent.base.coffee;

import cn.vincent.base.Beverage;
/**
 * ×ÛºÏ¿§·È
 * @author Vincent
 *
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "HouseBlend----×ÛºÏ¿§·È";
	}
	@Override
	public double cost() {
		return .89;
	}

}
