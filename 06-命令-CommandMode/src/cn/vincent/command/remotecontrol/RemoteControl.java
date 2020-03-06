package cn.vincent.command.remotecontrol;

import cn.vincent.command.Command;
import cn.vincent.command.NoCommand;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	// 前一个执行的命令，存储于此
	Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for(int i = 0; i < 7; i ++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed(){
		undoCommand.undo();
	}
	// 覆盖toString()，打印出每个插槽和它的命令
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n--------Remote Control--------\n");
		for(int i = 0; i < onCommands.length; i ++) {
			stringBuffer.append("[slot" + i + "]" + onCommands[i].getClass().getName() + 
					"     " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuffer.toString();
	}
}
