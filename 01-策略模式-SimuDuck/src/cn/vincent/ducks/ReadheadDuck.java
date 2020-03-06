package cn.vincent.ducks;

//import cn.vincent.behavior.service.FlyBehavior;
//import cn.vincent.behavior.service.FlyableRedheadImpl;
//import cn.vincent.behavior.service.QuackBehavior;
//import cn.vincent.behavior.service.QuackableRedheadImpl;
import cn.vincent.supperclass.BaseDuck;

public class ReadheadDuck extends BaseDuck {

	@Override
	public void diplay(){
		System.out.println("ReadheadDuck外观是红头");
	}
//	private void performFly() {
//		FlyBehavior fly = new FlyableRedheadImpl();
//		fly.fly();
//	}
//	
//	private void performQuack() {
//		QuackBehavior quack = new QuackableRedheadImpl();
//		quack.quack();
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadheadDuck rd = new ReadheadDuck();
		rd.diplay();
		rd.swim();
		rd.performFly();
		rd.performQuack();
	}

}
