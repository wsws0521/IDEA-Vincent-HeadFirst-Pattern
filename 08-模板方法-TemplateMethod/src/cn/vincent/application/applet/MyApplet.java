package cn.vincent.application.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	String message;
	/**
	 * init()Ҳ�Ǹ����ӣ�appletһ��ʼ��ʱ����һ�����
	 */
	public void init() {
		message = "Hello there�� IM alive !";
		repaint(); // ��applet���ϲ�֪������applet��Ҫ�ػ�
	}
	public void start() {
		message = "NOW�� IM starting up !";
		repaint(); // ��applet���ϲ�֪������applet��Ҫ�ػ�
	}
	public void stop() {
		message = "OH�� IM being stopped !";
		repaint(); // ��applet���ϲ�֪������applet��Ҫ�ػ�
	}
	public void destroy() {
		// applet���ڱ�����
	}
	public void paint(Graphics g) {
		g.drawString(message, 5, 15);
	}
}
