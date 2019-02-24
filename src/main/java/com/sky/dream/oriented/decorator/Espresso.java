package com.sky.dream.oriented.decorator;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 20:30 2019/2/12
 * @Modified By:
 */
public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Espresso Coffee";
    }

    @Override
    public float cost() {
        return 1.99f;
    }
}
