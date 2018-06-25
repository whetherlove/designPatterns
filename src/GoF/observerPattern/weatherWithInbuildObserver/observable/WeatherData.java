package GoF.observerPattern.weatherWithInbuildObserver.observable;

import java.util.Observable;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.observerPattern.weatherWithInbuildObserver.observable
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 19:10
 * @UpdateDate: 2018/6/25/025 19:10
 */

//注意到Observable为一个类而非接口，违反了多用组合，少用继承的设计原则，这会限制到Observable的复用
//若有必要，自己完整写一个Observable接口将会更好
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementChanged(){
        //setChanged()用来标记改变已发生，该方法会将changes属性设置为true,
        setChanged();
        //当changes属性设置为true时，notifyObservers()才会调用观察者的update()方法
        //该方法会通知所有观察者，属于客户主动"push"，观察者被动接受
        notifyObservers();
    }

    //测试方法，用于主动改变观测值
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    //当观察者需要主动"pull"时,需要用到get方法
    //我的想法：使用pull会增加coupling，违背了high cohesion, low coupling的设计原则
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
