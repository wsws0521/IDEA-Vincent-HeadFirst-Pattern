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
		System.out.println("�������һöӲ��...");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuerter() {
		System.out.println("�㻹ûͶ����...");
	}

	@Override
	public void turnCrank() {
		System.out.println("��ת��ת��������ûͶ��...");
	}

	@Override
	public void dispense() {
		System.out.println("��Ͷ�ң��ǲ����ܷ����ǹ���...");
	}

}
