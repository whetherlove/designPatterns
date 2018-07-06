package compoundPatterns.duckSimulator.observer;

/**
 * @ProjectName: designPatterns
 * @Package: mvc.duckSimulator.observer
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 15:29
 * @UpdateDate: 2018/7/6/006 15:29
 */
public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist:" + duck + " just quack!");
    }
}
