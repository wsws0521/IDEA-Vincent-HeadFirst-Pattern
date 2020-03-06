package cn.vincent.beverage;

public abstract class CoffeeineBeverage {
	/**
	 * 
	 * ����˵����ģ�巽��(ĳ�������ϵġ��㷨��)
	 * ��������ԭ�򡿣��߲��绰���ײ㣬�ײ㲻Ӧ���߲�
	 * 
	 * ���ߣ�Vincent
	 * ����ʱ�䣺2019��3��15������1:57:25
	 */
	public final void prepareRecipe() {
		boilWater();	// ��ˮ
		brew();			// ���ݣ�������ȥʵ�֣�
		pourInCup();	// ������
		if(customWantAddCondiments()) {
			addCondiments(); // �ӵ��ϣ�������ȥʵ�֣�
		}
	}
	abstract void brew(); // ����
	abstract void addCondiments(); // �ӵ���
	void boilWater() {
		System.out.println("Boiling water");
	}
	void pourInCup() {
		System.out.println("Pour into cup");
	}
	// ���ӣ�hook���������ѡ���Ƿ񸲸�
	boolean customWantAddCondiments() {
		return true;
	}
}
