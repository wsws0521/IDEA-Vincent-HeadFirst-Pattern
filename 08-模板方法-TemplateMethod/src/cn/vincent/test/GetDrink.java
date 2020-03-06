package cn.vincent.test;

import cn.vincent.beverage.Coffee;
import cn.vincent.beverage.Tea;

public class GetDrink {

	public static void main(String[] args) {
		Tea tea = new Tea();
		System.out.println("\nMaking your tea......");;
		tea.prepareRecipe();
		
		Coffee coffee = new Coffee();
		System.out.println("\nMaking your coffee......");;
		coffee.prepareRecipe();
	}

}
