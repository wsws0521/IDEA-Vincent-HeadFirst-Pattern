package cn.vincent.supperclass;

import cn.vincent.behavior.service.FlyBehavior;
import cn.vincent.behavior.service.QuackBehavior;

public abstract class BaseDuck {
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public void swim(){
		System.out.println("����swim");
	}
	public abstract void diplay();
	
	//ί�и�flyBehavior����ȥ�������ɽ���Ϊ��������������Ϊ
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}

	
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
}
