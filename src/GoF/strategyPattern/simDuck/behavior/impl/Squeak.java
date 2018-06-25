package GoF.strategyPattern.simDuck.behavior.impl;

import GoF.strategyPattern.simDuck.behavior.QuackBehavior;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.strategyPattern.simDuck.behavior.impl
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 13:57
 * @UpdateDate: 2018/6/25/025 13:57
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("squeaking...");
    }
}
