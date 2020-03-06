package cn.vincent.status;

import cn.vincent.machine.GumballMachine;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	public NoQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("你插入了一枚硬币...");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuerter() {
		System.out.println("你还没投币呢...");
	}

	@Override
	public void turnCrank() {
		System.out.println("你转归转，反正还没投币...");
	}

	@Override
	public void dispense() {
		System.out.println("不投币，是不可能发放糖果的...");
	}

}
