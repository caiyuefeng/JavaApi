package com.sky.dream.oriented.adapter.turkry;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 21:59 2019/2/15
 * @Modified By:
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("呱呱叫...");
    }

    @Override
    public void fly() {
        System.out.println("长途飞行");
    }
}
