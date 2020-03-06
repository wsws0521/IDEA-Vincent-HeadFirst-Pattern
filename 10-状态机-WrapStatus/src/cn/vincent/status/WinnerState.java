package cn.vincent.status;

import cn.vincent.machine.GumballMachine;

/**
 * 
 * ��˵��������һ������䶯�����ڼ����һ��״̬
 * 
 * ����ʱ�䣺2019��3��18������6:06:27
 * @author Administrator-Vincent
 */
public class WinnerState implements State {
	
	GumballMachine gumballMachine;
	public WinnerState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		System.out.println("�㴦���н�״̬����ȴ���ȡ2���ǹ�...");
	}

	@Override
	public void ejectQuerter() {
		System.out.println("�㴦���н�״̬����ȴ���ȡ2���ǹ�...");
	}

	@Override
	public void turnCrank() {
		System.out.println("�㴦���н�״̬����ȴ���ȡ2���ǹ�...");
	}

	@Override
	public void dispense() {
		System.out.println("��ϲ�㣡���н��ˣ�����2���ǹ�...");
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() == 0) { // �����еĲ��� ����һ�� û�����
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}else { // �ٷ�һ��
			gumballMachine.releaseBall();
			if(gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}else {
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
