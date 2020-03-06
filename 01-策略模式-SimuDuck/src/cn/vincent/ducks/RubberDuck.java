package cn.vincent.ducks;

//import cn.vincent.behavior.service.QuackBehavior;
//import cn.vincent.behavior.service.QuackableRubberImpl;
import cn.vincent.supperclass.BaseDuck;

public class RubberDuck extends BaseDuck {

	@Override
	public void diplay(){
		System.out.println("RubberDuckÕ‚π€");
	}
	
//	private void performQuack() {
//		QuackBehavior quack = new QuackableRubberImpl();
//		quack.quack();
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseDuck rd = new RubberDuck();
		rd.diplay();
		rd.performQuack();
	}

}
