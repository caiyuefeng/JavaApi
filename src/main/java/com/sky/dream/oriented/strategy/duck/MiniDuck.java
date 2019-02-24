package com.sky.dream.oriented.strategy.duck;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 14:23 2019/2/11
 * @Modified By:
 */
public class MiniDuck {
    public static void main(String[] args) {
        Duck duck1 = new MallarDuck();
        duck1.performFly();
        duck1.perforQuack();
        Duck duck2 = new ModelDuck();
        duck2.setFly(new FlyWithRock());
        duck2.performFly();

    }
}
