package cn.vincent.ducks;

//import cn.vincent.behavior.service.FlyBehavior;
import cn.vincent.behavior.service.FlyableMallardImpl;
//import cn.vincent.behavior.service.QuackBehavior;
import cn.vincent.behavior.service.QuackableMallardImpl;
import cn.vincent.supperclass.BaseDuck;

public class MallardDuck extends BaseDuck{
	
	public MallardDuck() {
		//������public�����Ľӿ�����  ʵ�����������������๹���ж�̬��ȡ
		quackBehavior = new QuackableMallardImpl();
		flyBehavior = new FlyableMallardImpl();
	}
	
	
	@Override
	public void diplay(){
		System.out.println("MallardDuck�������ͷ");
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
