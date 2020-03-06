package cn.vincent.test;

import cn.vincent.behavior.service.FlyableRedheadImpl;
import cn.vincent.ducks.MallardDuck;
import cn.vincent.supperclass.BaseDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseDuck model = new MallardDuck();
		model.performFly();
		model.setFlyBehavior(new FlyableRedheadImpl());
		model.performFly();
	}

}
