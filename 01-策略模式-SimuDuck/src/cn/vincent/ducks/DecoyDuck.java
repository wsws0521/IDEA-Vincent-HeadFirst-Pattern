package cn.vincent.ducks;

import cn.vincent.supperclass.BaseDuck;

public class DecoyDuck extends BaseDuck {

	@Override
	public void diplay(){
		System.out.println("DecoyDuckÕ‚π€");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecoyDuck rd = new DecoyDuck();
		rd.diplay();
	}

}
