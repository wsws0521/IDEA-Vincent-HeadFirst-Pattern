package cn.vincent.decorate;

import cn.vincent.base.Beverage;

/**
 * 调料装饰类
 * @author Vincent
 *
 */
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
