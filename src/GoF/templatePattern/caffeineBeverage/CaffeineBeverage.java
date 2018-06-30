package GoF.templatePattern.caffeineBeverage;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.templatePattern.caffeineBeverage
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/30/030 9:28
 * @UpdateDate: 2018/6/30/030 9:28
 */
public abstract class CaffeineBeverage {

    abstract void brew();

    void boilWater(){
        System.out.println("Boiling water...");
    }

    void pourInCup(){
        System.out.println("Pouring into cup...");
    }

    abstract void addCondiments();

    //模板不希望子类覆盖
    final void prepareRecipe() {
        brew();
        boilWater();
        pourInCup();
        addCondiments();
    }
}
