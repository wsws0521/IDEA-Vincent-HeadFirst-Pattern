package cn.vincent.ducks;

//import cn.vincent.behavior.service.FlyBehavior;
import cn.vincent.behavior.service.FlyableMallardImpl;
//import cn.vincent.behavior.service.QuackBehavior;
import cn.vincent.behavior.service.QuackableMallardImpl;
import cn.vincent.supperclass.BaseDuck;

public class MallardDuck extends BaseDuck{
	
	public MallardDuck() {
		//父类中public声明的接口类型  实例变量，我们在子类构造中多态获取
		quackBehavior = new QuackableMallardImpl();
		flyBehavior = new FlyableMallardImpl();
	}
	
	
	@Override
	public void diplay(){
		System.out.println("MallardDuck外观是绿头");
	}
	
//	private void performFly() {
////		FlyBehavior fly = new FlyableMallardImpl();
////		fly.performFly();
//		flyBehavior.fly();
//	}
//	
//	private void performQuack() {
//		QuackBehavior quack = new QuackableMallardImpl();
//		quack.quack();
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseDuck md = new MallardDuck();
		md.diplay();
		md.performFly();
		md.performQuack();
	}

}
