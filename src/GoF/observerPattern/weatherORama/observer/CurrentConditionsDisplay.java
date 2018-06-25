package GoF.observerPattern.weatherORama.observer;

import GoF.observerPattern.weatherORama.subject.WeatherData;
import sun.java2d.pipe.OutlineTextRenderer;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.observerPattern.weatherORama.observer
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 17:27
 * @UpdateDate: 2018/6/25/025 17:27
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;

    //便于之后取消关注
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("Current Condition:");
        System.out.println("temperature:" + temperature + " F degree");
        System.out.println("humidity:" + humidity + "%");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperature = temp;
        this.humidity = humidity;
        display();
    }
}
