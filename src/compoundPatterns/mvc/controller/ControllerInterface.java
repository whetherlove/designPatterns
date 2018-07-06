package compoundPatterns.mvc.controller;

/**
 * @ProjectName: designPatterns
 * @Package: compoundPatterns.mvc.controller
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 17:04
 * @UpdateDate: 2018/7/6/006 17:04
 */
public interface ControllerInterface {

    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);

}
