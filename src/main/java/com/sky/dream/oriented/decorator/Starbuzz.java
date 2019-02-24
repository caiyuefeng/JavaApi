package com.sky.dream.oriented.decorator;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 20:50 2019/2/12
 * @Modified By:
 */
public class Starbuzz {
    public static void main(String[] args) {
        Beverage b1 = new DarkRoast();
        b1 = new Milk(b1);
        b1 = new Mocha(b1);
        System.out.println(b1.getDescription() + "\t花费:" + b1.cost());
    }
}
