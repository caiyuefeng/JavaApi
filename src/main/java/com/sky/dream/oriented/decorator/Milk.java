package com.sky.dream.oriented.decorator;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 20:46 2019/2/12
 * @Modified By:
 */
public class Milk implements Beverage {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ",milk";
    }

    @Override
    public float cost() {
        return 0.1f + this.beverage.cost();
    }
}
