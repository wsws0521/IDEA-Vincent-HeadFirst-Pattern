package cn.vincent.monitor;

import cn.vincent.obj.GumballMachine;

public class GumballMonitor {
	GumballMachine gumballMachine = new GumballMachine("Hangzhou");

	public GumballMonitor(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}
	
	public void report() {
		System.out.println("µÿ÷∑ «£∫ " + gumballMachine.getLocation());
	}
}
