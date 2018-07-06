package compoundPatterns.duckSimulator.observer;

/**
 * @ProjectName: designPatterns
 * @Package: mvc.duckSimulator.observer
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 15:05
 * @UpdateDate: 2018/7/6/006 15:05
 */
public interface Observer {

    void update(QuackObservable duck);
}
