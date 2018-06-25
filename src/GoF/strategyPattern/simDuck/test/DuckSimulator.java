package GoF.strategyPattern.simDuck.test;

import GoF.strategyPattern.simDuck.behavior.impl.FlyRocketPowered;
import GoF.strategyPattern.simDuck.entity.Duck;
import GoF.strategyPattern.simDuck.entity.MallardDuck;
import GoF.strategyPattern.simDuck.entity.ModelDuck;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.strategyPattern.test
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 14:10
 * @UpdateDate: 2018/6/25/025 14:10
 */
public class DuckSimulator {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        
    }
}
