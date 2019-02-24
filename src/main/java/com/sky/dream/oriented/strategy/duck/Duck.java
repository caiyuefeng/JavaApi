package com.sky.dream.oriented.strategy.duck;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 13:48 2019/2/11
 * @Modified By:
 */
public abstract class Duck {

    /**
     * 飞行行为
     */
    FlyBehavior fly;

    /**
     * 呱呱叫行为
     */
    QuackBehavior quack;

    /**
     * 呱呱叫
     */
    public void perforQuack() {
        quack.quack();
    }

    /**
     * 游泳
     */
    public void swim() {
        System.out.println("游泳");
    }

    /**
     * 鸭子外观
     */
    public void display() {

    }

    /**
     * 飞行
     */
    public void performFly() {
        fly.fly();
    }

    public void setFly(FlyBehavior fly) {
        this.fly = fly;
    }

    public void setQuack(QuackBehavior quack) {
        this.quack = quack;
    }
}
