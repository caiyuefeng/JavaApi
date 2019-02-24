package com.sky.dream.oriented.strategy.duck;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description: 绿头鸭
 * @Date : Create in 13:49 2019/2/11
 * @Modified By:
 */
public class MallarDuck extends Duck {

    public MallarDuck() {
        fly = new FlyWithWings();
        quack = new Quack();
    }

    @Override
    public void display() {
        System.out.println("外观是绿色的");
    }
}
