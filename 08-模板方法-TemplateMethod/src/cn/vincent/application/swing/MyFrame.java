package cn.vincent.application.swing;

import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JFrame;
/**
 * 
 * ��˵����JFrame���������swing����
 * 
 * ����ʱ�䣺2019��3��15������3:04:36
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
	 * ������paint�ǲ�������ģ����ӣ�hook��
	 */
	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "I rule !!!!";
		graphics.drawString(msg, 100, 100);
	}
	
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("һ�ؼ�ë");
	}

}
