package GoF.templatePattern;

import javax.swing.*;
import java.awt.*;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.templatePattern
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/30/030 10:16
 * @UpdateDate: 2018/6/30/030 10:16
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }

    //paint()是一个典型的hook方法，在父类中他什么都不做
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "I rule!!";
        g.drawString(msg,100,100);
    }

    public static void main(String[] args) {
        new MyFrame("my frame");
    }
}
