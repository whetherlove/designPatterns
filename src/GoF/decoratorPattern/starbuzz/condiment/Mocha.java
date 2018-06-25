package GoF.decoratorPattern.starbuzz.condiment;

import GoF.decoratorPattern.starbuzz.beverage.Beverage;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.decoratorPattern.starbuzz.condiment
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 21:32
 * @UpdateDate: 2018/6/25/025 21:32
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
