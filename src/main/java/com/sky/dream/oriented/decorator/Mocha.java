package com.sky.dream.oriented.decorator;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 20:43 2019/2/12
 * @Modified By:
 */
public class Mocha implements Beverage {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ",Mocha";
    }

    @Override
    public float cost() {
        return 0.20f + beverage.cost();
    }
}
