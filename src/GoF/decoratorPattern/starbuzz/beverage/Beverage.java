package GoF.decoratorPattern.starbuzz.beverage;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.decoratorPattern.starbuzz.beverage
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 21:20
 * @UpdateDate: 2018/6/25/025 21:20
 */
public abstract class Beverage {

    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
