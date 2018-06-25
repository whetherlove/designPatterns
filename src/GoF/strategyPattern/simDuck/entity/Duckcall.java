package GoF.strategyPattern.simDuck.entity;

import GoF.strategyPattern.simDuck.behavior.QuackBehavior;
import GoF.strategyPattern.simDuck.behavior.impl.Quack;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.strategyPattern.simDuck.entity
 * @Description: Duckcall是一种猎人用鸭鸣模拟器，用于诱捕猎物
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 14:28
 * @UpdateDate: 2018/6/25/025 14:28
 */
public class Duckcall {

    private QuackBehavior quackBehavior = new Quack();

    public void allure(){
        quackBehavior.quack();
    }
}
