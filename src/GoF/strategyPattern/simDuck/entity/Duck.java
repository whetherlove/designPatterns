package GoF.strategyPattern.simDuck.entity;

import GoF.strategyPattern.simDuck.behavior.FlyBehavior;
import GoF.strategyPattern.simDuck.behavior.QuackBehavior;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.strategyPattern
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 13:51
 * @UpdateDate: 2018/6/25/025 13:51
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(){}

    public abstract void display();

    public void swim(){
        System.out.println("all ducks float!");
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    //setter methods 动态改变鸭子行为
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
