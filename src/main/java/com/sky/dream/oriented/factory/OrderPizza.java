package com.sky.dream.oriented.factory;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 23:08 2019/2/13
 * @Modified By:
 */
public class OrderPizza {
    public static void main(String[] args) {
        ChicagoPizzaStore store1 = new ChicagoPizzaStore();
        NYPizzaStore store2 = new NYPizzaStore();
        store1.orderPizza("cheese");
        store2.orderPizza("cheese");


    }
}
