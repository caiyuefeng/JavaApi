package com.sky.dream.oriented.command;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description: 命令模式命令接口
 * @Date : Create in 21:58 2019/2/14
 * @Modified By:
 */
public interface Command {
    public void execute();

    public void undo();
}
