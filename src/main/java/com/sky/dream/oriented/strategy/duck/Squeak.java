package com.sky.dream.oriented.strategy.duck;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 14:16 2019/2/11
 * @Modified By:
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("唧唧叫");
    }
}
