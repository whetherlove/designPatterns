package GoF.morePatterns.chainOfResponsibility;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.morePatterns.chainOfResponsibility
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/11/011 9:42
 * @UpdateDate: 2018/7/11/011 9:42
 */
public class Client {

    public static void main(String[] args) {
        SpamHandler spamHandler = new SpamHandler();
        FanHandler fanHandler = new FanHandler();
        ComplaintHandler complaintHandler = new ComplaintHandler();
        NewLocHandler newLocHandler = new NewLocHandler();

        spamHandler.successor = fanHandler;
        fanHandler.successor = complaintHandler;
        complaintHandler.successor = newLocHandler;

        spamHandler.handleRequest("Fan");
        spamHandler.handleRequest("adada");
    }
}
