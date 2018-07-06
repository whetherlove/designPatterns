package compoundPatterns.duckSimulator.observer;

import java.util.ArrayList;

/**
 * @ProjectName: designPatterns
 * @Package: mvc.duckSimulator.observer
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 15:23
 * @UpdateDate: 2018/7/6/006 15:23
 */
public abstract class QuackObservable implements Observable,Quackable {

    ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(e -> e.update(this));
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void act(){
        quack();
        notifyObservers();
    }

}
