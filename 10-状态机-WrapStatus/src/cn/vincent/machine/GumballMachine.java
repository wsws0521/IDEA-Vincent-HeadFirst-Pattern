package cn.vincent.machine;

import cn.vincent.status.SoldState;
import cn.vincent.status.HasQuarterState;
import cn.vincent.status.NoQuarterState;
import cn.vincent.status.SoldOutState;
import cn.vincent.status.State;
import cn.vincent.status.WinnerState;

public class GumballMachine {
	State soldOutState; // ������
	State noQuarterState;
	State hasQuarterState;
	State SoldState; // ���۳�
	
	State winnerState; // �������, �н���10%
//	final static int SOLD_OUT = 0;
//	final static int NO_QUARTER = 1;
//	final static int HAS_QUARTER = 2;
//	final static int SOLD = 3;
	State state = soldOutState;
	int count = 0; // �ǹ�����
		
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		SoldState = new SoldState(this);
		
		winnerState = new WinnerState(this); // �������
		this.count = numberGumballs;
		if(numberGumballs > 0) {
			// �����ʣ���ǹ� ״̬��Ϊ ��Ͷ��
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	public void ejectQuarter() {
		state.ejectQuerter();
	}
	public void turnCrank() {
		state.turnCrank();
		state.dispense(); // �ö�����ʵ���Զ���  �������������������
	}
	public void releaseBall() {
		System.out.println("һ���ǹ� ���ڴ� �ۿ� ������...");
		if(count != 0) {
			count = count - 1;
		}
	}
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public State getSoldOutState() {
		return soldOutState;
	}
	public State getNoQuarterState() {
		return noQuarterState;
	}
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	public State getSoldState() {
		return SoldState;
	}
	public State getWinnerState() {
		return winnerState;
	}
	public String toString() {
		return state.toString();
	}
}
