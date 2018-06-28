package GoF.commandPattern.remote;

import GoF.commandPattern.remote.commands.Command;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.commandPattern.remote.remoteTest
 * @Description: simple remote 只有一组开关
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/28/028 13:53
 * @UpdateDate: 2018/6/28/028 13:53
 */
public class SimpleRemote {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void on() {
        command.execute();
    }

    public void off() {
        command.undo();
    }

}
