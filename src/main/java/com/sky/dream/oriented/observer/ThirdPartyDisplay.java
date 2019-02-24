package com.sky.dream.oriented.observer;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 17:54 2019/2/12
 * @Modified By:
 */
public class ThirdPartyDisplay implements Observer {
    @Override
    public void update(float temp, float hum, float press) {

    }

    @Override
    public void display() {
        System.out.println("显示其他内容");
    }
}
