package com.sky.dream.oriented.strategy.duck;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 14:25 2019/2/11
 * @Modified By:
 */
public class FlyWithRock implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("使用火箭动力飞行");
    }
}
