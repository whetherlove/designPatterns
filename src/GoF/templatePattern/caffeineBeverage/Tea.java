package GoF.templatePattern.caffeineBeverage;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.templatePattern.caffeineBeverage
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/30/030 9:37
 * @UpdateDate: 2018/6/30/030 9:37
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon...");
    }
}
