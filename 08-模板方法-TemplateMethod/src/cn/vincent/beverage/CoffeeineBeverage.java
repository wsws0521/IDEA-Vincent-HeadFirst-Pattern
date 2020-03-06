package cn.vincent.beverage;

public abstract class CoffeeineBeverage {
	/**
	 * 
	 * 方法说明：模板方法(某种意义上的“算法”)
	 * 【好莱坞原则】：高层打电话给底层，底层不应调高层
	 * 
	 * 作者：Vincent
	 * 创建时间：2019年3月15日下午1:57:25
	 */
	public final void prepareRecipe() {
		boilWater();	// 烧水
		brew();			// 冲泡（由子类去实现）
		pourInCup();	// 倒进来
		if(customWantAddCondiments()) {
			addCondiments(); // 加调料（由子类去实现）
		}
	}
	abstract void brew(); // 冲泡
	abstract void addCondiments(); // 加调料
	void boilWater() {
		System.out.println("Boiling water");
	}
	void pourInCup() {
		System.out.println("Pour into cup");
	}
	// 钩子（hook）子类可以选择是否覆盖
	boolean customWantAddCondiments() {
		return true;
	}
}
