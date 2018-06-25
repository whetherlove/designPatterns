package GoF.decoratorPattern.starbuzz.beverage;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.decoratorPattern.starbuzz.beverage
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 21:26
 * @UpdateDate: 2018/6/25/025 21:26
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.98;
    }
}
