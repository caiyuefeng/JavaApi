package com.sky.dream.oriented.strategy.character;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 19:05 2019/2/11
 * @Modified By:
 */
public class Knight extends Character {
    public Knight() {
        weapon = new AxeBehavior();
    }
}
