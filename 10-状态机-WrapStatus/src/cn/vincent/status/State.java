package cn.vincent.status;
// ��ʵҲ���Զ���Ϊ���� ��Щͨ�õķ���  �����м̳еļ�ֵ��
public interface State {
	void insertQuarter();
	void ejectQuerter();
	void turnCrank();
	void dispense();
}
