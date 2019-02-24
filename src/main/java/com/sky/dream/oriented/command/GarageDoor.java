package com.sky.dream.oriented.command;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 22:06 2019/2/14
 * @Modified By:
 */
public class GarageDoor {

    public void up() {
        System.out.println("升起");
    }

    public void down() {
        System.out.println("降下");
    }

    public void stop() {
        System.out.println("停止");
    }

    public void lightOn() {
        System.out.println("开灯");
    }

    public void lightOff() {
        System.out.println("关灯");
    }
}

