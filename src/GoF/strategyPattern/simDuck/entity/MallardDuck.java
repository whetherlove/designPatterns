package GoF.strategyPattern.simDuck.entity;

import GoF.strategyPattern.simDuck.behavior.impl.FlyWithWings;
import GoF.strategyPattern.simDuck.behavior.impl.Quack;

import java.util.Iterator;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.strategyPattern.simDuck.entity
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 14:05
 * @UpdateDate: 2018/6/25/025 14:05
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real MallardDuck!");
    }
}
