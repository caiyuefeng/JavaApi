package com.sky.dream.oriented.strategy.character;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 19:04 2019/2/11
 * @Modified By:
 */
public class King extends Character {

    public King() {
        weapon = new SwordBehavior();
    }
}
