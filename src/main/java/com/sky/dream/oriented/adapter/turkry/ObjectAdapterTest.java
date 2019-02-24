package com.sky.dream.oriented.adapter.turkry;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 22:01 2019/2/15
 * @Modified By:
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        Duck adapter = new TurkeyAdapter(new WildTurkey());
        adapter.quack();
        adapter.fly();
    }
}
