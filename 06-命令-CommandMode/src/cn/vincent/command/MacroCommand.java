package cn.vincent.command;

public class MacroCommand implements Command{
	Command[] commands;
	
	public MacroCommand(Command[] commands) {
		super();
		this.commands = commands;
	}

	@Override
	public void execute() {
		for(int i =0; i < commands.length; i ++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		for(int i =0; i < commands.length; i ++) {
			commands[i].undo();
		}
	}

}
