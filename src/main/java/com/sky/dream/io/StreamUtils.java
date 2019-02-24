package com.sky.dream.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @Author: 蔡月峰
 * @Description: 输入输出流
 * @Date : Create in 11:39 2018/10/5
 * @Modified By:
 */
public class StreamUtils {

    /**
     * 字符串拼接器
     */
    private final static StringBuilder BUILDER = new StringBuilder();

    /**
     * 读取字节流
     *
     * @param path 待读取文件路径
     * @return 文本信息
     */
    public static String read(String path) throws IOException {
        InputStream in = null;
        try {
            in = StreamUtils.class.getResourceAsStream(path);
            return read(in);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
        return null;
    }

    public static String read(InputStream in) throws IOException {
        BUILDER.setLength(0);
        byte[] buffer = new byte[in.available()];
        while (in.read(buffer) != -1) {
            BUILDER.append(new String(buffer));
        }
        return BUILDER.toString();
    }

    public static void write(String filePath, byte[] byteArray) throws IOException {
        OutputStream out = null;
        try {
            out = new FileOutputStream(filePath);
            write(out, byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public static void write(OutputStream outputStream, byte[] bytes) throws IOException {
        outputStream.write(bytes);
        outputStream.flush();
    }

    public static void write(String filePath, String content) throws IOException {
        write(filePath, content.getBytes());
    }

    /**
     * 读取输入二进制流中的指定字节数，并以UTF-8 格式返回字符串
     * 若输入流中未达到指定字节数则以流中全部字节数为准
     * 若输入流中超过指定字节数则以指定字节数为准
     *
     * @param input    二进制流
     * @param byteSize 指定字节数
     * @return 读入字符串
     */
    public static String readBinary(DataInput input, int byteSize) throws IOException {
        final byte[] array = new byte[byteSize];
        int i = 0;
        for (; i < byteSize; i++) {
            try {
                array[i] = input.readByte();
            } catch (EOFException e) {
                break;
            }
        }
        final byte[] destArray = new byte[i];
        System.arraycopy(array, 0, destArray, 0, i);
        return new String(destArray, StandardCharsets.UTF_8);
    }

    public static String readBinary(RandomAccessFile input, int byteSize, int startIndex) throws IOException {
        input.seek(startIndex);
        return readBinary(input, byteSize);
    }

    /**
     * 将字符串指定字节长度写入二进制写入文本
     *
     * @param line         字符串
     * @param standardSize 写入字节长度
     * @param output       二进制输出流
     */
    public static void writeBinary(String line, int standardSize, DataOutput output) throws IOException {
        byte[] array = line.getBytes();
        for (int i = array.length; i < standardSize; i++) {
            array[i] = 0;
        }
        output.write(line.getBytes(), 0, array.length);
    }

    /**
     * 将字符串写入二进制写入文本
     *
     * @param line   字符串
     * @param output 二进制输出流
     */
    public static void writeBinary(String line, DataOutput output) throws IOException {
        writeBinary(line, line.getBytes().length, output);
    }

    /**
     * 设置随机访问文件流的开始写入字节位置
     *
     * @param line             待写入字符串
     * @param startIndex       开始位置索引
     * @param randomAccessFile 输出流
     */
    public static void writeBinary(String line, int startIndex, RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.seek(startIndex);
        writeBinary(line, randomAccessFile);
    }

    public static void write(PrintWriter writer, String content) {
        writer.print(content);
        writer.flush();
        writer.close();
    }
}
