package GoF.singletonPattern.chocOHolic;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.singletonPattern.chocOHolic
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/27/027 10:41
 * @UpdateDate: 2018/6/27/027 10:41
 */
public class ChocolateBoiler {

    private boolean isEmpty;
    private boolean isBoiled;

    private static final ChocolateBoiler chocolateBoiler = new ChocolateBoiler();

    private ChocolateBoiler(){
        isEmpty = true;
        isBoiled = false;
    }

    public static ChocolateBoiler getInstance(){
        return chocolateBoiler;
    }


}
