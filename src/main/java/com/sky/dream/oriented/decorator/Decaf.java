package com.sky.dream.oriented.decorator;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 20:29 2019/2/12
 * @Modified By:
 */
public class Decaf implements Beverage {
    @Override
    public String getDescription() {
        return "Decaf Coffee";
    }

    @Override
    public float cost() {
        return 1.05f;
    }
}
