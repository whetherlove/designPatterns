package compoundPatterns.duckSimulator.composite;

import compoundPatterns.duckSimulator.ducks.Quackable;

import java.util.ArrayList;

/**
 * @ProjectName: designPatterns
 * @Package: mvc.duckSimulator.composite
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 10:01
 * @UpdateDate: 2018/7/6/006 10:01
 */
public class Flock extends ArrayList<Quackable> implements Quackable {

    @Override
    public void quack() {
        this.forEach(Quackable::quack);
    }
}
