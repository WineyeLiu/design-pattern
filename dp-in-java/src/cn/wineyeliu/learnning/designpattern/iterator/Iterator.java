package cn.wineyeliu.learnning.designpattern.iterator;
/**
 * iterator interface
 * @author LiuWenai
 * Create on 2018/9/11 21:09
 */
public interface Iterator<T> {
    /**
     * test if has next element
     * @return boolean: if has next element, return true, else false.
     */
    boolean hasNext();

    /**
     * get next element.
     * @return T: next element.
     */
    T next();
}
