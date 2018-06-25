package GoF.strategyPattern.simDuck.entity;

import GoF.strategyPattern.simDuck.behavior.impl.FlyNoWay;
import GoF.strategyPattern.simDuck.behavior.impl.Quack;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.strategyPattern.simDuck.entity
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 14:14
 * @UpdateDate: 2018/6/25/025 14:14
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
