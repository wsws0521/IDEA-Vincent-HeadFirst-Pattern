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
		System.out.println("��ȴ����ȱ�Ͷ�������۳�...");
	}

	@Override
	public void ejectQuerter() {
		System.out.println("���Ѿ���Ū�ˣ����ڲ�������...");
	}

	@Override
	public void turnCrank() {
		System.out.println("��ȴ��������ظ���Ū");
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
