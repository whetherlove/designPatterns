package GoF.decoratorPattern.starbuzz.beverage;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.decoratorPattern.starbuzz.beverage
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 21:26
 * @UpdateDate: 2018/6/25/025 21:26
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
