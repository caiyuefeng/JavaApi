package com.sky.dream.oriented.observer;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 17:46 2019/2/12
 * @Modified By:
 */
public class CurrentConditionDisplay implements Observer {

    private float temp;

    private float hum;

    private float press;

    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float hum, float press) {
        this.temp = temp;
        this.hum = hum;
        this.press = press;
        display();
    }

    @Override
    public void display() {
        System.out.println("当前温度:" + temp + "\t湿度:" + hum + "\t压强:" + press);
    }
}
