package com.sky.dream.oriented.command;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description:
 * @Date : Create in 22:08 2019/2/14
 * @Modified By:
 */
public class GarageDoorOnCommand implements Command {

    private GarageDoor door;

    public GarageDoorOnCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }

    @Override
    public void undo() {
        door.down();
    }
}
