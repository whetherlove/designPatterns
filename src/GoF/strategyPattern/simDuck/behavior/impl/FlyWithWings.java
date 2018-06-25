package GoF.strategyPattern.simDuck.behavior.impl;

import GoF.strategyPattern.simDuck.behavior.FlyBehavior;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.strategyPattern
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 13:52
 * @UpdateDate: 2018/6/25/025 13:52
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("flying...");
    }
}
