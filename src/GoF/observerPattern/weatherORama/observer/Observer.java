package GoF.observerPattern.weatherORama.observer;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.observerPattern.weatherORama.observer
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 16:52
 * @UpdateDate: 2018/6/25/025 16:52
 */
public interface Observer {

    //当气象观测值改变时，主题会将数据作为参数传给观察者
    public void update(float temp, float humidity, float pressure);
}
