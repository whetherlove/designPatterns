package GoF.morePatterns.chainOfResponsibility;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.morePatterns.chainOfResponsibility
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/11/011 9:18
 * @UpdateDate: 2018/7/11/011 9:18
 */
public abstract class Handler {

    Handler successor;

    public abstract void handleRequest(String request);
}
