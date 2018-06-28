package GoF.commandPattern;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.commandPattern.remote
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/28/028 15:05
 * @UpdateDate: 2018/6/28/028 15:05
 */
public interface logCommand {

    void execute();
    void undo();

    //存储日志,将所有execute undo等操作记录到日志中
    void store();
    void load();
}
