package com.sky.dream.io;

import com.sky.dream.io.io.FileUtils;
import com.sky.dream.io.io.StreamUtils;
import org.junit.Test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

import static org.junit.Assert.*;

/**
 * @Author: 蔡月峰
 * @Description:
 * @Date : Create in 12:22 2018/10/5
 * @Modified By:
 */
public class StreamUtilsTest {

    @Test
    public void read() throws Exception {
        String content = "1、这是测试java输入输出流." +System.getProperty("line.separator")+
                "2、this is english char.";
        assertEquals(content, StreamUtils.read("/InputFile.txt"));
        assertEquals(content, StreamUtils.read(StreamUtilsTest.class.getResourceAsStream("/InputFile.txt")));
        FileInputStream input = new FileInputStream("D:\\WorkSpace\\JavaApi\\src\\main\\resources\\InputFile.txt");
        assertEquals(content, StreamUtils.readBinary(new DataInputStream(input),input.available()));
        RandomAccessFile randomAccessFile = new RandomAccessFile("./output/randomFile.txt","rw");
        assertEquals(content,StreamUtils.readBinary(randomAccessFile,64));
        randomAccessFile.close();
    }

    @Test
    public void byteWrite() throws Exception {
        String content = "1、这是测试java输入输出流."+System.getProperty("line.separator")+"2、this is english char.";
        byte[] byteArray = content.getBytes();
        System.out.println(FileUtils.deleteFile("./output/OutputFile_1.txt"));
        FileUtils.deleteFile("./output/OutputFile_2.txt");
        FileUtils.deleteFile("./output/randomFile.txt");
        StreamUtils.write("./output/OutputFile_1.txt",byteArray);
        RandomAccessFile randomAccessFile = new RandomAccessFile("./output/randomFile.txt","rw");
        StreamUtils.writeBinary(content,content.getBytes().length,randomAccessFile);
        StreamUtils.writeBinary(content,randomAccessFile);
        randomAccessFile.close();
    }

    @Test
    public void charRead() throws Exception {
        System.out.println(System.getProperty("Charset.defaultCharset"));
    }

    @Test
    public void charWrite() throws Exception {
    }

}