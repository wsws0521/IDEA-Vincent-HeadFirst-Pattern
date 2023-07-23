## 命令模式
线程直接调一个 execute 接口就好了 代码简洁（但是理解有困难，不知道哪个实现类）

### [命令]
* Command 接口 ： +execute()  +undo()
* LightOnCommand 具体命令 : 具体实现了 execute() 就是 对自己的私有变量进行操作
* MacroCommand 宏命令 ： 具体实现了 execute() 就是 对自己的命令数组遍历执行



### 把 [具体命令/宏命令] 放入 [命令控制器]  
RemoteControl
-OnCommand
-OffCommand
或者
-OnCommand[]  其实就是 一排 <序号-开命令-关命令>
-OffCommand[]  其实就是 一排 <序号-开命令-关命令>

+execute(可以指定数组位置execute，顺便指定当前命令给undo，那么undo就无需指定数组位置了)  (宏命令时 就可以执行一串了)
+next()
+set(可以指定数组位置set)

