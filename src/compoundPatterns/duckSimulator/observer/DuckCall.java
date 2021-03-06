package compoundPatterns.duckSimulator.observer;

/**
 * @ProjectName: designPatterns
 * @Package: mvc.duckSimulator.observer
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 15:16
 * @UpdateDate: 2018/7/6/006 15:16
 */
public class DuckCall extends QuackObservable {

    @Override
    public void quack() {
        System.out.println("Kwak");
    }

    @Override
    public String toString() {
        return "DuckCall";
    }
}
