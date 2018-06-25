package GoF.observerPattern.weatherORama.subject;

import GoF.observerPattern.weatherORama.observer.Observer;

import java.util.ArrayList;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.observerPattern.weatherORama.subject
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 17:17
 * @UpdateDate: 2018/6/25/025 17:17
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0)
            observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        //不要尝试依赖观察者通知顺序，这会导致high coupling
        //for(int i=0; i<observers.size(); i++)     X
        observers.forEach(e -> e.update(temperature,humidity,pressure));   //  √
    }

    //气象站观测值更新时hi调用此方法
    public void measurementChanged(){
        notifyObservers();
    }

    //测试方法，用于主动改变观测值
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

}
