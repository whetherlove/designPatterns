package GoF.adapterPattern.objectAdapter;

import GoF.adapterPattern.entity.Duck;
import GoF.adapterPattern.entity.Turkey;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.adapterPattern.objectAdapter
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/29/029 19:11
 * @UpdateDate: 2018/6/29/029 19:11
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gabble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
