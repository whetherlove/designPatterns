package GoF.singletonPattern.chocOHolic;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.singletonPattern.chocOHolic
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/27/027 10:41
 * @UpdateDate: 2018/6/27/027 10:41
 */
public class DoubleCheckChocolateBoiler {

    private boolean isEmpty;
    private boolean isBoiled;

    //volatile关键词确保，当chocolateBoiler被实例化时，多个线程正确的处理该变量
    private volatile static DoubleCheckChocolateBoiler chocolateBoiler;

    private DoubleCheckChocolateBoiler(){
        isEmpty = true;
        isBoiled = false;
    }

    public static DoubleCheckChocolateBoiler getInstance(){
        //仅在第一次获取对象时执行同步
        synchronized (DoubleCheckChocolateBoiler.class) {
            if (chocolateBoiler == null){
                chocolateBoiler = new DoubleCheckChocolateBoiler();
            }
        }
        return chocolateBoiler;
    }

    
}
