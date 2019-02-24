package com.sky.dream.oriented.iterator;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 21:53 2019/2/18
 * @Modified By:
 */
public class DinerMenu {

    private int maxSize = 6;

    private MenuItem[] menuItems;

    private int index = 0;


    public DinerMenu() {
        this.menuItems = new MenuItem[6];

        addItem("Vegetarian BLT", "Bacon", true, 2.99F);
        addItem("BLT", "Bacon", false, 2.99F);
        addItem("Soup of the day", "soup", false, 3.99F);
        addItem("HotDog", "hot dog", true, 3.05F);

    }

    public void addItem(String name, String description, boolean vegetarian, float price) {
        menuItems[index] = new MenuItem(name, vegetarian, price, description);
        index++;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
