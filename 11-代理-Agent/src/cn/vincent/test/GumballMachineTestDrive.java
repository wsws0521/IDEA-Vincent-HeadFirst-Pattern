package cn.vincent.test;

import cn.vincent.monitor.GumballMonitor;
import cn.vincent.obj.GumballMachine;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		int count = 0;
		if(args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		count = Integer.parseInt(args[1]);
		GumballMachine gumballMachine = new GumballMachine(args[0]);
		GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
		
		gumballMonitor.report();
	}
}
