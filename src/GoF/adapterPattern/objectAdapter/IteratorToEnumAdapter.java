package GoF.adapterPattern.objectAdapter;

import java.util.*;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.adapterPattern.objectAdapter
 * @Description: ArrayList只支持iterator而不支持enumeration,此类将Iterator接口转化为Enumeration接口
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/29/029 19:54
 * @UpdateDate: 2018/6/29/029 19:54
 */
public class IteratorToEnumAdapter<T> implements Enumeration<T> {

    Iterator iterator;

    public IteratorToEnumAdapter(Iterator iterator){
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public T nextElement() {
        return (T) iterator.next();
    }

}
