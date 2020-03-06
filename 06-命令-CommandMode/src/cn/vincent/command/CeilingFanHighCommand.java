package cn.vincent.command;

import cn.vincent.pojo.CeilingFan;

public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// 改变转速之前，先将之前的状态 保存起来
		prevSpeed = ceilingFan.getSpeed();
		// 比如调为最高，课件该方法有时需要传参进来···
		ceilingFan.high();
	}
	@Override
	public void undo() {
		switch(prevSpeed) {
		case CeilingFan.OFF:
			ceilingFan.off();
			break;
		case CeilingFan.LOW:
			ceilingFan.low();
			break;
		case CeilingFan.MEDIUM:
			ceilingFan.medium();
			break;
		case CeilingFan.HIGH:
			ceilingFan.high();
			break;
		}
		System.out.println("撤销风扇速度回：" + ceilingFan.getSpeed());
	}
	
}
