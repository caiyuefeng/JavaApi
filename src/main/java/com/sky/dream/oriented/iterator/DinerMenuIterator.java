package com.sky.dream.oriented.iterator;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 21:58 2019/2/18
 * @Modified By:
 */
public class DinerMenuIterator implements Iterator {

    private MenuItem[] menu;

    private int index = 0;

    public DinerMenuIterator(MenuItem[] menu) {
        this.menu = menu;
    }

    @Override
    public Object next() {
        return index < menu.length ? menu[index] : null;
    }

    @Override
    public boolean hasNext() {
        return index < menu.length;
    }
}
