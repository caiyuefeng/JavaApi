package com.sky.dream.oriented.iterator;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 21:41 2019/2/18
 * @Modified By:
 */
public class MenuItem {

    /**
     * 名称
     */
    private String name;

    /**
     * 是否是素食
     */
    private boolean vegetarian;

    /**
     * 价格
     */
    private float price;

    /**
     * 描述
     */
    private String description;


    public MenuItem(String name, boolean vegetarian, float price, String description) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
