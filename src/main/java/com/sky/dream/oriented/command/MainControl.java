package com.sky.dream.oriented.command;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 22:03 2019/2/14
 * @Modified By:
 */
public class MainControl {
    public static void main(String[] args) {
        SimpleControl control = new SimpleControl();
        Light light = new Light();
        lightOnCommand lightOnCommand = new lightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        control.setCommand(0, lightOnCommand, lightOffCommand);
        GarageDoor door = new GarageDoor();
        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(door);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(door);
        control.setCommand(1, garageDoorOnCommand, garageDoorOffCommand);
        Stereo stereo = new Stereo();
        control.setCommand(2, new StereoOnCommand(stereo), new StereoOffCommand(stereo));
        control.onButtonPress(0);
        control.onButtonPress(1);
        control.onButtonPress(2);
        control.offButtonPress(0);
        control.offButtonPress(1);
        control.offButtonPress(2);
        control.undoButtonPress();
    }
}
