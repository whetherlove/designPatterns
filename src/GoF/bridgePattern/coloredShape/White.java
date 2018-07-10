package GoF.bridgePattern.coloredShape;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.bridgePattern
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/10/010 20:14
 * @UpdateDate: 2018/7/10/010 20:14
 */
public class White implements Color {

    @Override
    public void bePaint(String shape) {
        System.out.println("白色的" + shape);
    }
}
