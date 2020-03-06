package cn.vincent.status;

import cn.vincent.machine.GumballMachine;

/**
 * 
 * 类说明：这是一个需求变动，后期加入的一个状态
 * 
 * 创建时间：2019年3月18日下午6:06:27
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
		System.out.println("你处于中奖状态，请等待提取2个糖果...");
	}

	@Override
	public void ejectQuerter() {
		System.out.println("你处于中奖状态，请等待提取2个糖果...");
	}

	@Override
	public void turnCrank() {
		System.out.println("你处于中奖状态，请等待提取2个糖果...");
	}

	@Override
	public void dispense() {
		System.out.println("恭喜你！你中奖了，给你2个糖果...");
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() == 0) { // 万幸中的不幸 发了一个 没库存了
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}else { // 再发一颗
			gumballMachine.releaseBall();
			if(gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}else {
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
