package GoF.observerPattern.weatherORama.subject;

import GoF.observerPattern.weatherORama.observer.Observer;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.observerPattern.weatherORama.subject
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 16:50
 * @UpdateDate: 2018/6/25/025 16:50
 */
public interface Subject {

    //注册或删除观察者
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    //主题方法改变时，调用该方法，以通知所有观察者
    public void notifyObservers();

}
