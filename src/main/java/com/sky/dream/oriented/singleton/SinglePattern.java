package com.sky.dream.oriented.singleton;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description: 单例模式
 * @Date : Create in 21:17 2019/2/14
 * @Modified By:
 */
public class SinglePattern {

    private static SinglePattern tool = null;

    private SinglePattern() {
    }


    public static SinglePattern getInstance() {
        if (tool == null) {
            tool = new SinglePattern();
        }
        return tool;
    }


}
