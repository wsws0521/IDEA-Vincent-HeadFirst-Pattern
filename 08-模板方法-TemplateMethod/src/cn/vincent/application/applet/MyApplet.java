package cn.vincent.application.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	String message;
	/**
	 * init()也是个钩子，applet一开始的时候会调一次这个
	 */
	public void init() {
		message = "Hello there， IM alive !";
		repaint(); // 让applet的上层知道，该applet需要重绘
	}
	public void start() {
		message = "NOW， IM starting up !";
		repaint(); // 让applet的上层知道，该applet需要重绘
	}
	public void stop() {
		message = "OH， IM being stopped !";
		repaint(); // 让applet的上层知道，该applet需要重绘
	}
	public void destroy() {
		// applet正在被销毁
	}
	public void paint(Graphics g) {
		g.drawString(message, 5, 15);
	}
}
