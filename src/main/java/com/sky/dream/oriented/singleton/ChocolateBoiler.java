package com.sky.dream.oriented.singleton;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description: 巧克力锅炉
 * @Date : Create in 21:22 2019/2/14
 * @Modified By:
 */
public class ChocolateBoiler {

    /**
     * 炉空标志
     */
    private boolean empty;

    /**
     * 煮沸标志
     */
    private boolean boiled;

    private volatile static ChocolateBoiler chocolateBoiler = null;


    public static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoiler == null) {
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoiler;
    }


    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fild() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("添加牛奶和巧克力混合物");
        }
    }

    public void boil() {
        // 煮沸牛奶巧克力
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public void drain() {
        // 排出牛奶巧克力
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
