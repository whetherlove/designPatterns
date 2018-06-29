package GoF.adapterPattern.entity;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.adapterPattern.objectAdapter
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/29/029 19:10
 * @UpdateDate: 2018/6/29/029 19:10
 */
public class WildTurkey implements Turkey {

    @Override
    public void gabble() {
        System.out.println("Gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
