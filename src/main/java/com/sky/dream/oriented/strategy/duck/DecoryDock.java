package com.sky.dream.oriented.strategy.duck;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description: 诱饵鸭
 * @Date : Create in 13:56 2019/2/11
 * @Modified By:
 */
public class DecoryDock extends Duck {

    public DecoryDock() {
        quack = new MuteQuack();
        fly = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("外观是诱饵鸭");
    }
}
