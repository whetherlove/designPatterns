package GoF.morePatterns.chainOfResponsibility;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.morePatterns.chainOfResponsibility
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/11/011 9:24
 * @UpdateDate: 2018/7/11/011 9:24
 */
public class ComplaintHandler extends Handler {

    @Override
    public void handleRequest(String request) {
        if ("Complaint".equals(request))
            System.out.println("to law department");
        else
            successor.handleRequest(request);
    }
}
