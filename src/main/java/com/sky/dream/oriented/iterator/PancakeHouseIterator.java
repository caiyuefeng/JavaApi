package com.sky.dream.oriented.iterator;

import java.util.ArrayList;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 22:01 2019/2/18
 * @Modified By:
 */
public class PancakeHouseIterator implements Iterator {

    private ArrayList<MenuItem> menuItems;

    private int index = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public Object next() {
        return menuItems.get(index);
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}


