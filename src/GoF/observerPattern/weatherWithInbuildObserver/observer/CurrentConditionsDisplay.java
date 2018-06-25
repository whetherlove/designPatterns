package GoF.observerPattern.weatherWithInbuildObserver.observer;

import GoF.observerPattern.weatherORama.observer.DisplayElement;
import GoF.observerPattern.weatherWithInbuildObserver.observable.WeatherData;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.observerPattern.weatherWithInbuildObserver.observer
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 19:22
 * @UpdateDate: 2018/6/25/025 19:22
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    private ArrayList<Observable> observables;

    public CurrentConditionsDisplay(ArrayList<Observable> observables) {
        this.observables = observables;
        observables.forEach(e -> e.addObserver(this));
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("Current Condition:");
        System.out.println("temperature:" + temperature + " F degree");
        System.out.println("humidity:" + humidity + "%");
    }

    /**
     * update 接受两个参数，第一个是Observable o,用来确定到底是哪个客户传的数据，
     * 如此一来可以同时关注多个客户
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            //通过getters仅获取自己需要的信息
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
