package com.sky.dream.oriented.observer;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 20:08 2019/2/12
 * @Modified By:
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay display1 = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(5.0f, 54.1f, 23.6f);

    }


}
