package GoF.morePatterns.iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.morePatterns.iteratorPattern
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/7/10/010 15:29
 * @UpdateDate: 2018/7/10/010 15:29
 */
public class JavaInbuiltIterator {

    /*
    迭代器模式 提供一种方法 顺序访问一个聚合对象中的各个元素
              而又不暴露其内部的表示
     */

    public static void main(String[] args) {

        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(3);
        aList.add(2);
        aList.add(4);

        Iterator it = aList.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}
