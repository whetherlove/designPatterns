package GoF.singletonPattern.chocOHolic;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.singletonPattern.chocOHolic
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/27/027 10:41
 * @UpdateDate: 2018/6/27/027 10:41
 */
public class LazyChocolateBoiler {

    private boolean isEmpty;
    private boolean isBoiled;

    private static LazyChocolateBoiler chocolateBoiler;

    private LazyChocolateBoiler(){
        isEmpty = true;
        isBoiled = false;
    }

    //每次调用该方法都需要同步，但事实上只有第一次调用需要同步
    public static synchronized LazyChocolateBoiler getInstance(){
        if (chocolateBoiler == null)
            chocolateBoiler = new LazyChocolateBoiler();
        return chocolateBoiler;
    }


}
