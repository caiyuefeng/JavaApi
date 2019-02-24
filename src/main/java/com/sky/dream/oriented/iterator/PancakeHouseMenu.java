package com.sky.dream.oriented.iterator;

import java.util.ArrayList;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 21:44 2019/2/18
 * @Modified By:
 */
public class PancakeHouseMenu {

    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        addItem("K&B's Pancake Breakfast", "Pancakes with " +
                "scrambled eggs,and toast", true, 2.99F);
        addItem("Regular Pancake Breakfast", "Pancakes with " +
                "fried eggs,and sausage", true, 2.99F);
        addItem("Blueberry Breakfast", "Pancakes made with " +
                "fresh blueberries", true, 3.49F);
        addItem("Waffles", "Waffles , with " +
                "your choice of blueberries or strawberries", true, 3.59F);
    }


    public void addItem(String name, String description, boolean vegetarian, float price) {
        menuItems.add(new MenuItem(name, vegetarian, price, description));
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}


