package cn.vincent.application.swing;

import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JFrame;
/**
 * 
 * 类说明：JFrame是最基本的swing容器
 * 
 * 创建时间：2019年3月15日下午3:04:36
 * @author Administrator-Vincent
 */
public class MyFrame extends JFrame{

	public MyFrame(String title) throws HeadlessException {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}
	/**
	 * 父类中paint是不做事情的（钩子，hook）
	 */
	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "I rule !!!!";
		graphics.drawString(msg, 100, 100);
	}
	
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("一地鸡毛");
	}

}
