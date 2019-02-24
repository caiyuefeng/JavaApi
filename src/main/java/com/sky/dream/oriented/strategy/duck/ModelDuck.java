package com.sky.dream.oriented.strategy.duck;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 14:25 2019/2/11
 * @Modified By:
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        fly = new FlyNoWay();
        quack = new Quack();
    }
}
