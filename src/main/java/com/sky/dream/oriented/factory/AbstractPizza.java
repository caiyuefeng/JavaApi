package com.sky.dream.oriented.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 22:50 2019/2/13
 * @Modified By:
 */
public abstract class AbstractPizza implements Pizza {

    /**
     * 披萨名称
     */
    private String name;

    /**
     * 面团类型
     */
    private String dough;

    /**
     * 酱料类型
     */
    private String sauce;

    /**
     * 佐料
     */
    private List<String> topping = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getTopping() {
        return topping;
    }

    public void setTopping(List<String> topping) {
        this.topping = topping;
    }

    @Override
    public void prepare() {
        System.out.println("准备制作披萨:" + name);
        System.out.println("准备面团:" + dough);
        System.out.println("加入酱料:" + sauce);
        for (String top : topping) {
            System.out.println("加入佐料:" + top);
        }
    }

    @Override
    public void bake() {
        System.out.println("开始烘焙披萨:" + name);
    }

    @Override
    public void cut() {
        System.out.println("开始切片披萨:" + name);
    }

    @Override
    public void box() {
        System.out.println("开始包装披萨:" + name);
    }
}
