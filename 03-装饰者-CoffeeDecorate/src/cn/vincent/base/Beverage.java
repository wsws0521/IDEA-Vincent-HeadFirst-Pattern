package cn.vincent.base;
/**
 * ÒûÁÏ»ùÀà
 * @author Vincent
 *
 */
public abstract class Beverage {
	protected String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
}
