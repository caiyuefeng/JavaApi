package com.sky.dream.oriented.adapter.turkry;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 21:57 2019/2/15
 * @Modified By:
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("咯咯叫...");
    }

    @Override
    public void fly() {
        System.out.println("短途飞行");
    }
}
