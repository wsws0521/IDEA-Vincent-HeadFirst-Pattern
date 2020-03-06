package cn.vincent.command;

import cn.vincent.pojo.Stereo;

public class StereoOnComamnd implements Command{
	Stereo stereo;

	public StereoOnComamnd(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();
	}
	
}
