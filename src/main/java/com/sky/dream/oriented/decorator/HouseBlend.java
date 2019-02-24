package com.sky.dream.oriented.decorator;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 20:29 2019/2/12
 * @Modified By:
 */
public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public float cost() {
        return 0.89f;
    }
}
