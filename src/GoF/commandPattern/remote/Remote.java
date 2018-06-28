package GoF.commandPattern.remote;

import GoF.commandPattern.remote.commands.Command;

import java.util.Stack;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.commandPattern.remote
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/28/028 14:17
 * @UpdateDate: 2018/6/28/028 14:17
 */
public class Remote {

    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> preCommands;

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void on(int slot){
        Command c = onCommands[slot];
        c.execute();
        preCommands.push(c);
    }

    public void off(int slot){
        Command c = offCommands[slot];
        c.execute();
        preCommands.push(c);
    }

    public void undo(){
        if (preCommands.empty()) return;
        Command c = preCommands.pop();
        c.undo();
    }

}
