package GoF.commandPattern.remote.commands;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.commandPattern
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/28/028 13:47
 * @UpdateDate: 2018/6/28/028 13:47
 */
public interface Command {

    void execute();
    void undo();
}
