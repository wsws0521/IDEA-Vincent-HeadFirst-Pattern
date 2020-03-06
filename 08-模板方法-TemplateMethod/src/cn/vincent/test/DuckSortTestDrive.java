package cn.vincent.test;

import java.util.Arrays;

import cn.vincent.application.ducksort.Duck;
import cn.vincent.beverage.Coffee;
import cn.vincent.beverage.Tea;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		Duck ducks[] = { new Duck("Duck1", 70),
				new Duck("Duck2", 60),
				new Duck("Duck3", 50),
				new Duck("Duck4", 40),
				new Duck("Duck5", 30),
				new Duck("Duck6", 20),
				new Duck("Duck7", 10) };
		System.out.println("Before sort........");
		display(ducks);
		// sort就属于“模板方法”
		Arrays.sort(ducks);
		System.out.println("After sort........");
		display(ducks);
	}
	public static void display(Duck[] ducks) {
		for(int i = 0; i < ducks.length; i ++) {
			System.out.println(ducks[i]);
		}
	}
}
