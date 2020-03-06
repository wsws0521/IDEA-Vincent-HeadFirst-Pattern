package cn.vincent.test;

import cn.vincent.machine.GumballMachine;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		System.out.println(gumballMachine);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		System.out.println("\n");
		gumballMachine.insertQuarter();
		System.out.println(gumballMachine);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
	}
}
