package com.sky.dream.oriented.strategy.character;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 19:03 2019/2/11
 * @Modified By:
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用宝剑");
    }
}
