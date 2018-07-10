package GoF.bridgePattern.coloredShape;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.bridgePattern.coloredShape
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/10/010 20:16
 * @UpdateDate: 2018/7/10/010 20:16
 */
public class ColoredShape {

    //桥接模式
    //http://www.cnblogs.com/chenssy/p/3317866.html

    //桥接模式抽象对象自身可变,桥接的接口可变,两者独立变化
    //对比策略模式,抽象对象自身行为不变,策略变化

    public static void main(String[] args) {
        //白色
        Color white = new White();
        //正方形
        Shape square = new Square();
        //白色的正方形
        square.setColor(white);
        square.draw();

        //长方形
        Shape rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();
    }
}
