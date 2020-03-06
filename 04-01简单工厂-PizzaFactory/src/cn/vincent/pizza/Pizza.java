package cn.vincent.pizza;

import java.math.BigDecimal;

public abstract class Pizza {

	protected String descryption;
	public abstract BigDecimal calPrice();
	
	public void prepare() {
		System.out.println(descryption + "   prepare，，，，，，，，");
	}
	
	public void cut() {
		System.out.println(descryption + "   cut，，，，，，，，");
	}
	
	public void box() {
		System.out.println(descryption + "   box，，，，，，，，");
	}
	
}
