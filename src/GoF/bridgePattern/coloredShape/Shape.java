package GoF.bridgePattern.coloredShape;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.bridgePattern
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/10/010 20:07
 * @UpdateDate: 2018/7/10/010 20:07
 */
public abstract class Shape {

    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
