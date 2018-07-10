package GoF.bridgePattern.coloredShape;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.bridgePattern
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/10/010 20:11
 * @UpdateDate: 2018/7/10/010 20:11
 */
public class Circle extends Shape {

    @Override
    public void draw() {
        color.bePaint("圆形");
    }
}
