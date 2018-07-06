package compoundPatterns.duckSimulator.observer;

/**
 * @ProjectName: designPatterns
 * @Package: mvc.duckSimulator.observer
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 15:40
 * @UpdateDate: 2018/7/6/006 15:40
 */
public class DuckSimulator {

    public static void main(String[] args) {
        Quackologist quackologist = new Quackologist();

        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        DuckCall duckCall = new DuckCall();
        RubberDuck rubberDuck = new RubberDuck();

        mallardDuck.registerObserver(quackologist);
        redheadDuck.registerObserver(quackologist);
        duckCall.registerObserver(quackologist);
        rubberDuck.registerObserver(quackologist);

        Flock flock = new Flock();
        flock.addDuck(mallardDuck);
        flock.addDuck(redheadDuck);
        flock.addDuck(duckCall);
        flock.addDuck(rubberDuck);

        flock.act();
    }
}
