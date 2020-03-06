package cn.vincent.status;

import java.util.Random;

import cn.vincent.machine.GumballMachine;

public class HasQuarterState implements State {
	// �������������10%�ļ���
	Random randomWinner = new Random(System.currentTimeMillis());
		
	GumballMachine gumballMachine;
	public HasQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		System.out.println("����һöӲ���ˣ������ظ�Ͷ��...");
	}

	@Override
	public void ejectQuerter() {
		System.out.println("�˻�Ӳ��");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("�յ���Ū����ȴ��³��ǹ�...");
		
		int winner = randomWinner.nextInt(10);
		if((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else {
			gumballMachine.setState(gumballMachine.getSoldState());	
		}
	}

	@Override
	public void dispense() { // ��״̬�µĲ�ǡ������
		System.out.println("��Ū���˻��Զ����۵�  �������������۶���");
	}

}
