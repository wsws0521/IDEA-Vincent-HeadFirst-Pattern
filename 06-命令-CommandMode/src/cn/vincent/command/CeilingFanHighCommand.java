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
		// �ı�ת��֮ǰ���Ƚ�֮ǰ��״̬ ��������
		prevSpeed = ceilingFan.getSpeed();
		// �����Ϊ��ߣ��μ��÷�����ʱ��Ҫ���ν���������
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
		System.out.println("���������ٶȻأ�" + ceilingFan.getSpeed());
	}
	
}
