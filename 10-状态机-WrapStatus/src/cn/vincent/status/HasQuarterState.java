package cn.vincent.status;

import java.util.Random;

import cn.vincent.machine.GumballMachine;

public class HasQuarterState implements State {
	// 随机数产生器，10%的几率
	Random randomWinner = new Random(System.currentTimeMillis());
		
	GumballMachine gumballMachine;
	public HasQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		System.out.println("已有一枚硬币了，请勿重复投币...");
	}

	@Override
	public void ejectQuerter() {
		System.out.println("退还硬币");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("收到拨弄，请等待吐出糖果...");
		
		int winner = randomWinner.nextInt(10);
		if((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else {
			gumballMachine.setState(gumballMachine.getSoldState());	
		}
	}

	@Override
	public void dispense() { // 此状态下的不恰当动作
		System.out.println("拨弄完了会自动发售的  无需主动请求发售动作");
	}

}
