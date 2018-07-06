package compoundPatterns.duckSimulator.observer;

import java.util.ArrayList;

/**
 * @ProjectName: designPatterns
 * @Package: mvc.duckSimulator.observer
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 15:16
 * @UpdateDate: 2018/7/6/006 15:16
 */
public class Flock extends QuackObservable {

    ArrayList<QuackObservable> ducks = new ArrayList<>();

    public void addDuck(QuackObservable duck){
        ducks.add(duck);
    }

    @Override
    public void quack() {
        ducks.forEach(QuackObservable::act);
    }

    @Override
    public String toString() {
        return "Duck flock";
    }
}
