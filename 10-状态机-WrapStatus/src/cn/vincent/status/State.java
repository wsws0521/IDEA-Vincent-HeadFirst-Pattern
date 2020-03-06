package cn.vincent.status;
// 其实也可以定义为抽象 有些通用的方法  还是有继承的价值的
public interface State {
	void insertQuarter();
	void ejectQuerter();
	void turnCrank();
	void dispense();
}
