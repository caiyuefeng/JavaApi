package com.sky.dream.oriented.strategy.character;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 19:06 2019/2/11
 * @Modified By:
 */
public class CharacterWar {
    public static void main(String[] args) {
        Character ch1 = new King();
        Character ch2 = new Queen();
        Character ch3 = new Troll();
        Character ch4 = new Knight();
        ch1.fight();
        ch2.fight();
        ch3.fight();
        ch4.fight();


    }
}
