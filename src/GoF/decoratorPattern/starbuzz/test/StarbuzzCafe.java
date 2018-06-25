package GoF.decoratorPattern.starbuzz.test;

import GoF.decoratorPattern.starbuzz.beverage.Beverage;
import GoF.decoratorPattern.starbuzz.beverage.DarkRoast;
import GoF.decoratorPattern.starbuzz.beverage.Espresso;
import GoF.decoratorPattern.starbuzz.beverage.HouseBlend;
import GoF.decoratorPattern.starbuzz.condiment.Mocha;
import GoF.decoratorPattern.starbuzz.condiment.Soy;
import GoF.decoratorPattern.starbuzz.condiment.Whip;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.decoratorPattern.starbuzz.test
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 21:36
 * @UpdateDate: 2018/6/25/025 21:36
 */
public class StarbuzzCafe {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
