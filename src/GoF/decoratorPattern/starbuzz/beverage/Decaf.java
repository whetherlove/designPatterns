package GoF.decoratorPattern.starbuzz.beverage;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.decoratorPattern.starbuzz.beverage
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 21:26
 * @UpdateDate: 2018/6/25/025 21:26
 */
public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
