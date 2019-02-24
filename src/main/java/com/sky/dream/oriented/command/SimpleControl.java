package com.sky.dream.oriented.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 22:01 2019/2/14
 * @Modified By:
 */
public class SimpleControl {

    private Command[] onCommand;

    private Command[] offCommand;

    private Command undoCommand;

    public SimpleControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
    }

    public void onButtonPress(int button) {
        onCommand[button].execute();
        undoCommand = onCommand[button];
    }

    public void offButtonPress(int button) {
        offCommand[button].execute();
        undoCommand = offCommand[button];
    }

    public void setCommand(int button, Command onCommand, Command offCommand) {
        this.onCommand[button] = onCommand;
        this.offCommand[button] = offCommand;

    }

    public void undoButtonPress() {
        undoCommand.undo();
    }
}
