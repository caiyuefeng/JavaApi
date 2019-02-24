package com.sky.dream.oriented.factory;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 23:03 2019/2/13
 * @Modified By:
 */
public class ChicagoStyleCheesePizza extends AbstractPizza {
    public ChicagoStyleCheesePizza() {
        setName("芝加哥风格芝士披萨");
        setDough("超薄面团");
        setSauce("虹芝麻酱");
        getTopping().add("虹芝士");
    }

}
