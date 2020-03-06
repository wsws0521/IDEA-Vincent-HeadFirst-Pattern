package cn.vincent.status;

import cn.vincent.machine.GumballMachine;

public class SoldState implements State {
	GumballMachine gumballMachine;
	public SoldState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		System.out.println("请等待，先别投，正在售出...");
	}

	@Override
	public void ejectQuerter() {
		System.out.println("你已经拨弄了，现在不给退了...");
	}

	@Override
	public void turnCrank() {
		System.out.println("请等待，请勿重复拨弄");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
