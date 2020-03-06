package cn.vincent.status;

import cn.vincent.machine.GumballMachine;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	public SoldOutState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		System.out.println("机器内糖果已售罄");
	}

	@Override
	public void ejectQuerter() {
		System.out.println("机器内糖果已售罄，你也没投币，退啥？");
	}

	@Override
	public void turnCrank() {
		System.out.println("机器内糖果已售罄，别拨弄");
	}

	@Override
	public void dispense() {
		System.out.println("机器内糖果已售罄，发售个毛");
	}

}
