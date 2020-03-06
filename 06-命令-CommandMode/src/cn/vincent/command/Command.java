package cn.vincent.command;

public interface Command {
	void execute();
	void undo();
	
	// 用于 日志记录
//	void store();
//	void load();
}
