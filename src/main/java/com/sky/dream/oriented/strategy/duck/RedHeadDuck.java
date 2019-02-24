package com.sky.dream.oriented.strategy.duck;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description: 红头鸭
 * @Date : Create in 13:50 2019/2/11
 * @Modified By:
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        fly = new FlyWithWings();
        quack = new Quack();
    }

    @Override
    public void display() {
        System.out.println("外观是红头的");
    }
}
