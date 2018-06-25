package GoF.decoratorPattern.starbuzz.condiment;

import GoF.decoratorPattern.starbuzz.beverage.Beverage;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.decoratorPattern.starbuzz.condiment
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 21:22
 * @UpdateDate: 2018/6/25/025 21:22
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
