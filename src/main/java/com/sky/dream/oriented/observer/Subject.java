package com.sky.dream.oriented.observer;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 17:41 2019/2/12
 * @Modified By:
 */
public interface Subject {

    /**
     * 注册
     */
    void registerObserver(Observer o);

    /**
     * 移除
     */
    void removeObserver(Observer o);

    /**
     * 唤醒
     */
    void notifyObserver();
}
