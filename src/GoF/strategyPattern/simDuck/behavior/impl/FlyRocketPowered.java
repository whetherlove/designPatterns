package GoF.strategyPattern.simDuck.behavior.impl;

import GoF.strategyPattern.simDuck.behavior.FlyBehavior;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.strategyPattern.simDuck.behavior.impl
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 14:16
 * @UpdateDate: 2018/6/25/025 14:16
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("rocketing...");
    }
}
