package cn.vincent.command;

import cn.vincent.pojo.Stereo;

public class StereoOffComamnd implements Command{
	Stereo stereo;

	public StereoOffComamnd(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
	
}
