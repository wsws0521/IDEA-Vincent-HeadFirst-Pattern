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
		// ����ң������
		// 1���½�ң����
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		// 2���½�ң�ض���
		Light light = new Light();
		// 3���½�ң������
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		// 4������ֲ��ң����
		simpleRemoteControl.setCommand(lightOnCommand);
		// 5����ʾ
		simpleRemoteControl.buttonWasPressed();
		
		// 3���½�ң������
		GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(new GarageDoor());
		// 4������ֲ��ң����
		simpleRemoteControl.setCommand(garageDoorUpCommand);
		// 5����ʾ
		simpleRemoteControl.buttonWasPressed();
		
		
		// �������š�ң������
		// 1���½�ң����
		RemoteControl remoteControl = new RemoteControl();
		// 2���½�ң�ض���
		Stereo stereo = new Stereo();// ����Ψһ
		// 3���½�ң������
		StereoOnComamnd stereoOnComamnd = new StereoOnComamnd(stereo);
		StereoOffComamnd stereoOffComamnd = new StereoOffComamnd(stereo);
		// 4������ֲ��ң����
		remoteControl.setCommand(3, stereoOnComamnd, stereoOffComamnd);
		System.out.println(remoteControl);// ��ʾ����
		// 5����ʾ
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.undoButtonWasPushed();
		
		// 2���½�ң�ض���
		CeilingFan ceilingFan = new CeilingFan("living room");// ����Ψһ
		// 3���½�ң������
		CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		// 4������ֲ��ң����
		remoteControl.setCommand(0, ceilingFanLowCommand, ceilingFanOffCommand);
		System.out.println(remoteControl);// ��ʾ�����š�ң����
		// 4������ֲ��ң����
		remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
		System.out.println(remoteControl);// ��ʾ�����š�ң����
		// 5����ʾ
		remoteControl.onButtonWasPushed(0);// ���ó�low��1
		remoteControl.onButtonWasPushed(1);// ���ó�high��3
		remoteControl.undoButtonWasPushed();// ������low��1
		
		// 3���½����ꡱ����
		Command[] partyOn = {stereoOnComamnd, ceilingFanLowCommand};
		Command[] partyOff = {stereoOffComamnd, ceilingFanOffCommand};
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		// 4������ֲ��ң����
		remoteControl.setCommand(6, partyOnMacro, partyOffMacro);
		System.out.println(remoteControl);// ��ʾ�����š�ң����
		// 5����ʾ
		System.out.println("----------------������-----------------");
		remoteControl.onButtonWasPushed(6);// �ȴ����죬�ٴ򿪷���-��
		System.out.println("----------------�����ر�-----------------");
		remoteControl.offButtonWasPushed(6);// �ȹر����죬�ٹرշ���
	}
}
