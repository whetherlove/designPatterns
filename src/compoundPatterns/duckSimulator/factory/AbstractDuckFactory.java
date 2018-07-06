package compoundPatterns.duckSimulator.factory;

import compoundPatterns.duckSimulator.ducks.Quackable;

/**
 * @ProjectName: designPatterns
 * @Package: mvc.duckSimulator.factory
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 8:28
 * @UpdateDate: 2018/7/6/006 8:28
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
