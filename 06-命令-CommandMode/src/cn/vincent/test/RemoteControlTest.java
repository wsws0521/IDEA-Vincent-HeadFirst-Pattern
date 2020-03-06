package cn.vincent.test;

import cn.vincent.command.CeilingFanHighCommand;
import cn.vincent.command.CeilingFanLowCommand;
import cn.vincent.command.CeilingFanOffCommand;
import cn.vincent.command.Command;
import cn.vincent.command.GarageDoorUpCommand;
import cn.vincent.command.LightOnCommand;
import cn.vincent.command.MacroCommand;
import cn.vincent.command.StereoOffComamnd;
import cn.vincent.command.StereoOnComamnd;
import cn.vincent.command.remotecontrol.RemoteControl;
import cn.vincent.command.remotecontrol.SimpleRemoteControl;
import cn.vincent.pojo.CeilingFan;
import cn.vincent.pojo.GarageDoor;
import cn.vincent.pojo.Light;
import cn.vincent.pojo.Stereo;

public class RemoteControlTest {
	
	public static void main(String[] args) {
		// 【简单遥控器】
		// 1、新建遥控器
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		// 2、新建遥控对象
		Light light = new Light();
		// 3、新建遥控命令
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		// 4、命令植入遥控器
		simpleRemoteControl.setCommand(lightOnCommand);
		// 5、演示
		simpleRemoteControl.buttonWasPressed();
		
		// 3、新建遥控命令
		GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(new GarageDoor());
		// 4、命令植入遥控器
		simpleRemoteControl.setCommand(garageDoorUpCommand);
		// 5、演示
		simpleRemoteControl.buttonWasPressed();
		
		
		// 【“插排”遥控器】
		// 1、新建遥控器
		RemoteControl remoteControl = new RemoteControl();
		// 2、新建遥控对象
		Stereo stereo = new Stereo();// 对象唯一
		// 3、新建遥控命令
		StereoOnComamnd stereoOnComamnd = new StereoOnComamnd(stereo);
		StereoOffComamnd stereoOffComamnd = new StereoOffComamnd(stereo);
		// 4、命令植入遥控器
		remoteControl.setCommand(3, stereoOnComamnd, stereoOffComamnd);
		System.out.println(remoteControl);// 显示插排
		// 5、演示
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.undoButtonWasPushed();
		
		// 2、新建遥控对象
		CeilingFan ceilingFan = new CeilingFan("living room");// 对象唯一
		// 3、新建遥控命令
		CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		// 4、命令植入遥控器
		remoteControl.setCommand(0, ceilingFanLowCommand, ceilingFanOffCommand);
		System.out.println(remoteControl);// 显示“插排”遥控器
		// 4、命令植入遥控器
		remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
		System.out.println(remoteControl);// 显示“插排”遥控器
		// 5、演示
		remoteControl.onButtonWasPushed(0);// 设置成low：1
		remoteControl.onButtonWasPushed(1);// 设置成high：3
		remoteControl.undoButtonWasPushed();// 撤销回low：1
		
		// 3、新建“宏”命令
		Command[] partyOn = {stereoOnComamnd, ceilingFanLowCommand};
		Command[] partyOff = {stereoOffComamnd, ceilingFanOffCommand};
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		// 4、命令植入遥控器
		remoteControl.setCommand(6, partyOnMacro, partyOffMacro);
		System.out.println(remoteControl);// 显示“插排”遥控器
		// 5、演示
		System.out.println("----------------批量打开-----------------");
		remoteControl.onButtonWasPushed(6);// 先打开音响，再打开风扇-低
		System.out.println("----------------批量关闭-----------------");
		remoteControl.offButtonWasPushed(6);// 先关闭音响，再关闭风扇
	}
}
