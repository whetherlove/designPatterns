package compoundPatterns.duckSimulator.factory;

import compoundPatterns.duckSimulator.decorator.QuackCounter;
import compoundPatterns.duckSimulator.ducks.*;

/**
 * @ProjectName: designPatterns
 * @Package: mvc.duckSimulator.factory
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 8:37
 * @UpdateDate: 2018/7/6/006 8:37
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
