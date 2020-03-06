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
		System.out.println("�������ǹ�������");
	}

	@Override
	public void ejectQuerter() {
		System.out.println("�������ǹ�����������ҲûͶ�ң���ɶ��");
	}

	@Override
	public void turnCrank() {
		System.out.println("�������ǹ�����������Ū");
	}

	@Override
	public void dispense() {
		System.out.println("�������ǹ������������۸�ë");
	}

}
