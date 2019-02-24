package com.sky.dream.oriented.observer;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 17:44 2019/2/12
 * @Modified By:
 */
public interface Observer {

    /**
     * 更新操作
     */
    void update(float temp, float hum, float press);

    /**
     * 显示方法
     */
    void display();
}
