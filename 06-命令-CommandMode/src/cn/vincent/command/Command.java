package cn.vincent.command;

public interface Command {
	void execute();
	void undo();
	
	// ���� ��־��¼
//	void store();
//	void load();
}
