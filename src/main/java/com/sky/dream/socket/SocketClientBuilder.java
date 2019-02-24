package com.sky.dream.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 蔡月峰
 * @Description: 套接字网络通信构造器
 * @Date : Create in 14:43 2018/10/7
 * @Modified By:
 */
public class SocketClientBuilder {

    private static class Tool {
        private static final SocketClientBuilder TOOL = new SocketClientBuilder();
    }

    private Map<String, Socket> uniqueMap = new HashMap<>(4);

    private SocketClientBuilder() {
    }

    public static SocketClientBuilder getInstance() {
        return Tool.TOOL;
    }


    public static Socket getInstance(ServerSocket serverSocket) throws IOException {
        return serverSocket.accept();
    }

    public void builder(String host, int port, String uuid) {
        try {
            Socket socket = new Socket();
            socket.setSoTimeout(10000);
            socket.connect(new InetSocketAddress(host, port));
            builder(socket, uuid);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void builder(Socket socket, String uuid) {
        uniqueMap.put(uuid, socket);
    }

    public InputStream builderInput(Socket socket) throws IOException {
        return socket.getInputStream();
    }

    public InputStream builderInput(String uuid) throws IOException {
        return builderInput(uniqueMap.get(uuid));
    }

    public OutputStream builderOutput(Socket socket) throws IOException {
        return socket.getOutputStream();
    }

    public OutputStream builderOutput(String uuid) throws IOException {
        return builderOutput(uniqueMap.get(uuid));
    }

    public void close() throws IOException {
        for (Socket socket : uniqueMap.values()) {
            socket.close();
        }

    }
}
