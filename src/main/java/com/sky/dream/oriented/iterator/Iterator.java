package com.sky.dream.oriented.iterator;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description: 迭代器接口
 * @Date : Create in 21:39 2019/2/18
 * @Modified By:
 */
public interface Iterator {

    /**
     * 迭代器下一个
     *
     * @return 实例对象
     */
    Object next();

    /**
     * 迭代器是否存在下一项
     *
     * @return true 是 false 不是
     */
    boolean hasNext();


}
