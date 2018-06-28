package GoF.commandPattern.remote.commands;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.commandPattern.remote.commands
 * @Description: 宏命令
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/28/028 14:42
 * @UpdateDate: 2018/6/28/028 14:42
 */
public class MacroCommand implements Command{

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command c : commands)
            c.execute();
    }

    @Override
    public void undo() {
        for (Command c : commands)
            c.undo();
    }
}
