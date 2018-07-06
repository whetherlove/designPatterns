package compoundPatterns.duckSimulator.factory;

import compoundPatterns.duckSimulator.ducks.*;

/**
 * @ProjectName: designPatterns
 * @Package: mvc.duckSimulator.factory
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 8:30
 * @UpdateDate: 2018/7/6/006 8:30
 */
public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
