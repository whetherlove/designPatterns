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
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
