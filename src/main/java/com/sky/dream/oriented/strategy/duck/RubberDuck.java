package com.sky.dream.oriented.strategy.duck;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description: 橡皮鸭
 * @Date : Create in 13:54 2019/2/11
 * @Modified By:
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        fly = new FlyNoWay();
        quack = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("外观是橡皮鸭");
    }

}
