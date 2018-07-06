package compoundPatterns.mvc.view;

import javax.swing.*;

/**
 * @ProjectName: designPatterns
 * @Package: compoundPatterns.mvc.view
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/6/006 17:01
 * @UpdateDate: 2018/7/6/006 17:01
 */
public class BeatBar extends JProgressBar implements Runnable {

    Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    @Override
    public void run() {
        for(;;) {
            int value = getValue();
            value = (int)(value * 0.75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

