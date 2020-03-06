package cn.vincent.decorate.dressing;

import cn.vincent.base.Beverage;
import cn.vincent.decorate.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
