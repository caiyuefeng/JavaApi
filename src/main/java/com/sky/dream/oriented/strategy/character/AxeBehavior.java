package com.sky.dream.oriented.strategy.character;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 19:02 2019/2/11
 * @Modified By:
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用斧头");
    }
}
