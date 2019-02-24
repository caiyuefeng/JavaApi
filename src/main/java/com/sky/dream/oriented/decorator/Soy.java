package com.sky.dream.oriented.decorator;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 20:47 2019/2/12
 * @Modified By:
 */
public class Soy implements Beverage {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ",soy";
    }

    @Override
    public float cost() {
        return 0.15f + this.beverage.cost();
    }
}
