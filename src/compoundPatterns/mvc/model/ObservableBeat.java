package compoundPatterns.mvc.model;

/**
 * @ProjectName: designPatterns
 * @Package: compoundPatterns.mvc.model
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 16:18
 * @UpdateDate: 2018/7/6/006 16:18
 */
public interface ObservableBeat {

    void init();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();

    //两种观察者，一种希望每个节拍都被通知，另一种只希望BPM改变时被通知
    void registerObserver(BeatObserver beatObserver);
    void registerObserver(BPMObserver bpmObserver);
    void removeBeatObserver(BeatObserver beatObserver);
    void removeBPMObserver(BPMObserver bpmObserver);
    void notifyBeatObservers();
    void notifyBPMObservers();
}
