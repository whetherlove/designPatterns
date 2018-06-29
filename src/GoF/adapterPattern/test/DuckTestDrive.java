package GoF.adapterPattern.test;

import GoF.adapterPattern.classAdapter.DuckAdapter;
import GoF.adapterPattern.entity.Duck;
import GoF.adapterPattern.entity.MallardDuck;
import GoF.adapterPattern.entity.WildTurkey;
import GoF.adapterPattern.objectAdapter.TurkeyAdapter;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.adapterPattern.objectAdapter
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/29/029 19:12
 * @UpdateDate: 2018/6/29/029 19:12
 */
public class DuckTestDrive {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("object adapter:");
        System.out.println("\nThe turkey says...");
        wildTurkey.gabble();
        wildTurkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(mallardDuck);

        System.out.println("\nThe objectAdapter says...");
        testDuck(turkeyAdapter);

        //classAdapter
        System.out.println("\nclass adapter:\n");
        DuckAdapter duckAdapter = new DuckAdapter();
        duckAdapter.quack();
        duckAdapter.fly();
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
