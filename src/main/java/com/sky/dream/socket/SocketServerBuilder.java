package com.sky.dream.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @Author: 蔡月峰
 * @Description: 套接字服务端构建类
 * @Date : Create in 14:54 2018/10/7
 * @Modified By:
 */
public class SocketServerBuilder {

    /**
     * 日志句柄
     */
    private static final Logger LOG = LoggerFactory.getLogger(SocketServerBuilder.class);

    private static class Tool {
        private static final SocketServerBuilder TOOL = new SocketServerBuilder();
    }

    /**
     * 单例的套接字服务端
     */
    private ServerSocket singleServer = null;

    private SocketServerBuilder() {
    }

    public static ServerSocket builderSingleServer(int port) {
        Tool.TOOL.singleServer = builder(port);
        return Tool.TOOL.singleServer;
    }

    public static ServerSocket builder(int port) {
        try {
            return new ServerSocket(port);
        } catch (IOException e) {
            LOG.error("Socket Server builder failure !", e);
        }
        return null;
    }
}
