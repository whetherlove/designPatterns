package compoundPatterns.duckSimulator.observer;

/**
 * @ProjectName: designPatterns
 * @Package: mvc.duckSimulator.observer
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 10:18
 * @UpdateDate: 2018/7/6/006 10:18
 */
public interface Observable {

    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
