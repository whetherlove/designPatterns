package compoundPatterns.mvc;

import compoundPatterns.mvc.controller.BeatController;
import compoundPatterns.mvc.controller.ControllerInterface;
import compoundPatterns.mvc.model.BeatModel;
import compoundPatterns.mvc.model.ObservableBeat;

/**
 * @ProjectName: designPatterns
 * @Package: compoundPatterns.mvc
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 17:07
 * @UpdateDate: 2018/7/6/006 17:07
 */
public class DJTestDrive {

    public static void main (String[] args) {
        ObservableBeat model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }

}
