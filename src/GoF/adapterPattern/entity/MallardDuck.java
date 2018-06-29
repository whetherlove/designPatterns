package GoF.adapterPattern.entity;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.adapterPattern.objectAdapter
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/29/029 19:08
 * @UpdateDate: 2018/6/29/029 19:08
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
