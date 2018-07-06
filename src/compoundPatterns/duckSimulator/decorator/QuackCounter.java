package compoundPatterns.duckSimulator.decorator;

import compoundPatterns.duckSimulator.ducks.Quackable;

/**
 * @ProjectName: designPatterns
 * @Package: mvc.duckSimulator.decorator
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 8:19
 * @UpdateDate: 2018/7/6/006 8:19
 */
public class QuackCounter implements Quackable {

    Quackable quackable;
    static int quackCount;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        quackCount++;
    }

    public static int getQuackCount() {
        return quackCount;
    }
}
