package cn.vincent.base.coffee;

import cn.vincent.base.Beverage;
/**
 * �ۺϿ���
 * @author Vincent
 *
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "HouseBlend----�ۺϿ���";
	}
	@Override
	public double cost() {
		return .89;
	}

}
