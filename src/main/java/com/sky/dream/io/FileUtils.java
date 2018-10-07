package com.sky.dream.io;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @Author: 蔡月峰
 * @Description: 文件操作工具类
 * @Date : Create in 12:02 2018/10/5
 * @Modified By:
 */
public class FileUtils {

    public static boolean deleteFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        return !file.isFile() || file.delete();
    }
}
