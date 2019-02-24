package com.sky.dream.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: 蔡月峰
 * @Version： 1.0
 * @Description: 套接字 服务端工厂类
 * 该工厂类
 * @Date : Create in 20:05 2018/10/8
 * @Modified By:
 */
public class SocketServerFactory {

    /**
     * 日志句柄
     */
    private static final Logger LOG = LoggerFactory.getLogger(SocketServerFactory.class);

    private static class Tool {
        private static SocketServerFactory TOOL = new SocketServerFactory();
    }

    private ExecutorService threadPool = new ThreadPoolExecutor(1, 1, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(1));

    private ServerSocket singleServer = null;

    private Socket singleClient = null;

    private SocketServerFactory() {
    }

    public static ServerSocket getDefaultInstance() {
        try {
            if (Tool.TOOL.singleServer == null) {
                synchronized (SocketServerFactory.class) {
                    if (Tool.TOOL.singleServer == null) {
//                        threadPool = new ThreadPoolExecutor(1,1,200, TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(1));
                        Tool.TOOL.singleServer = SocketServerBuilder.builderSingleServer(8189);
                    }
                }
            }
            if (Tool.TOOL.singleClient == null) {
                synchronized (SocketServerFactory.class) {
                    if (Tool.TOOL.singleClient == null) {
                        Tool.TOOL.singleClient = Tool.TOOL.singleServer.accept();
                    }
                }
            }
        } catch (IOException e) {
            LOG.error("Socket Client builder failure !", e);
        }
        return Tool.TOOL.singleServer;
    }

    public static InputStream getDefaultInputStream() throws IOException {
        getDefaultInstance();
        return Tool.TOOL.singleClient.getInputStream();
    }

    public static OutputStream getDefaultOutputStream() throws IOException {
        getDefaultInstance();
        return Tool.TOOL.singleClient.getOutputStream();
    }
}
