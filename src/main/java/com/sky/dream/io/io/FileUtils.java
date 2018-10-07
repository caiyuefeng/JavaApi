package com.sky.dream.io.io;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @Author: 蔡月峰
 * @Description: 文件操作工具类
 * @Date : Create in 12:02 2018/10/5
 * @Modified By:
 */
public class FileUtils {

    public static String toHexString(byte[] byteArray) {
        final StringBuilder builder = new StringBuilder();
        for (byte aByteArray : byteArray) {
            if ((aByteArray & 0xFF) < 0x10) {
                builder.append("0");
            }
            builder.append(Integer.toHexString(0xFF & aByteArray));
        }
        return builder.toString();
    }

    public static boolean deleteFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        return !file.isFile() || file.delete();
// throw new FileNotFoundException("cannot find the file " + filePath);
    }
}
