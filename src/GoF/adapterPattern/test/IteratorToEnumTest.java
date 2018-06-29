package GoF.adapterPattern.test;

import GoF.adapterPattern.objectAdapter.IteratorToEnumAdapter;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.adapterPattern.test
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/29/029 20:09
 * @UpdateDate: 2018/6/29/029 20:09
 */
public class IteratorToEnumTest {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        Iterator<Integer> iterator = arrayList.iterator();
        IteratorToEnumAdapter adapter = new IteratorToEnumAdapter(iterator);
        System.out.println(adapter.nextElement());
    }
}
