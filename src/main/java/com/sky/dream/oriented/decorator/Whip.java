package com.sky.dream.oriented.decorator;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 20:48 2019/2/12
 * @Modified By:
 */
public class Whip implements Beverage {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ",whip";
    }

    @Override
    public float cost() {
        return 0.10f + this.beverage.cost();
    }
}
