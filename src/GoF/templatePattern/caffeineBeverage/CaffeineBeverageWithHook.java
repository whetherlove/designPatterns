package GoF.templatePattern.caffeineBeverage;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.templatePattern.caffeineBeverage
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/30/030 9:28
 * @UpdateDate: 2018/6/30/030 9:28
 */
public abstract class CaffeineBeverageWithHook {

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
        if (customerWantsCondiments())
            addCondiments();
    }

    //hook(){}方法是一个具体方法，有默认实现。子类自行决定是否覆盖此方法
    //hook的存在让子类有能力对算法的不同点进行挂钩
    void hook(){}

    //一个具体的hook()方法
    boolean customerWantsCondiments(){
        return true;
    }
}
