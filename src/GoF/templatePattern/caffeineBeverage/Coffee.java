package GoF.templatePattern.caffeineBeverage;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.templatePattern.caffeineBeverage
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/30/030 9:34
 * @UpdateDate: 2018/6/30/030 9:34
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding suger and milk...");
    }
}
