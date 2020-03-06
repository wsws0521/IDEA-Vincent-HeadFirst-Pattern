package cn.vincent.command.remotecontrol;

import cn.vincent.command.Command;

public class SimpleRemoteControl {
	Command slot;
	public SimpleRemoteControl() {}
	public void setCommand(Command command) {
		this.slot = command;
	}
	public void buttonWasPressed() {
		slot.execute();
	}
}
