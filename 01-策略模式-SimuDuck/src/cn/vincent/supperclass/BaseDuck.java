package cn.vincent.supperclass;

import cn.vincent.behavior.service.FlyBehavior;
import cn.vincent.behavior.service.QuackBehavior;

public abstract class BaseDuck {
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public void swim(){
		System.out.println("父类swim");
	}
	public abstract void diplay();
	
	//委托给flyBehavior对象去处理呱呱叫行为，而不是亲力亲为
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
