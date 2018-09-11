package cn.wineyeliu.learnning.designpattern.iterator;
/**
 * aggregate interface
 * @author LiuWenai
 * Create on 2018/9/11 21:21
 */
public interface Aggregate<T> {
    /**
     * get an iterator
     * @return Iterator: an iterator
     */
    Iterator<? extends T> iterator();
}
