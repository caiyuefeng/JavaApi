package com.sky.dream.oriented.decorator;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 20:27 2019/2/12
 * @Modified By:
 */
public interface Beverage {

    /**
     * 获取描述
     *
     * @return 描述内容
     */
    public String getDescription();

    /**
     * 花费
     *
     * @return 价格
     */
    public float cost();


}
