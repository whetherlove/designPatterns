package GoF.adapterPattern.classAdapter;

import GoF.adapterPattern.entity.Duck;
import GoF.adapterPattern.entity.WildTurkey;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.adapterPattern.classAdapter
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/29/029 20:13
 * @UpdateDate: 2018/6/29/029 20:13
 */
public class DuckAdapter extends WildTurkey implements Duck {

    @Override
    public void quack() {
        gabble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            super.fly();
        }
    }

    public static void main(String[] args) {
        DuckAdapter duckAdapter = new DuckAdapter();
        duckAdapter.fly();
    }
}
