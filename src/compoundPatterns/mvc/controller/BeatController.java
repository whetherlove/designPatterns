package compoundPatterns.mvc.controller;

import compoundPatterns.mvc.model.ObservableBeat;
import compoundPatterns.mvc.view.DJView;

/**
 * @ProjectName: designPatterns
 * @Package: compoundPatterns.mvc.controller
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 17:06
 * @UpdateDate: 2018/7/6/006 17:06
 */
public class BeatController implements ControllerInterface {

    ObservableBeat model;
    DJView view;

    public BeatController(ObservableBeat model) {
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.init();
    }

    @Override
    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    @Override
    public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
    }

    @Override
    public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }

}
