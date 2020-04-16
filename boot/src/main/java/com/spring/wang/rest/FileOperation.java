package com.spring.wang.rest;

import java.io.*;

/**
 * @author Mark
 * @version 1.0
 * @date 2020/4/15 20:24
 * @description 读取PDF文档
 */
public class FileOperation {

    /**
     * 主方法测试
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
//        fileIsExists();
//        listFile(file);
//        readFileUseByte(file);
//        readFileUseChar(file);
//        writeByStream(file, s);
//        writeByChar(file, s);


        File file = new File("." + File.separator + "sql.sql");
        String s = "学习好好好";
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(System.lineSeparator());
        fileWriter.write("是的，哈哈哈哈");
        fileWriter.close();
        Runtime.getRuntime().exec("notepad " + file.getCanonicalPath());
    }

    /**
     * 使用字节流写文件
     *
     * @param file 文件
     * @param s    字符
     * @throws IOException
     */
    private static void writeByStream(File file, String s) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bytes = s.getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    /**
     * 使用字符流写文件
     *
     * @param file
     * @param s
     * @throws IOException
     */
    private static void writeByChar(File file, String s) throws IOException {
        FileWriter fileOutputStream = new FileWriter(file);
        char[] bytes = s.toCharArray();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    /**
     * 判断文件是否存在
     *
     * @throws IOException
     */
    private static void fileIsExists() throws IOException {
        File file = new File("." + File.separator + "sql.sql");
        String canonicalPath = file.getCanonicalPath();
        System.out.println("canonicalPath = " + canonicalPath);
        File fileCreate = new File("." + File.separator + "1.sql");
        if (!fileCreate.exists()) {
            System.out.println("fileCreate.createNewFile() = " + fileCreate.createNewFile());
        }
    }

    /**
     * 列出文件夹下的文件
     *
     * @param dir
     * @throws IOException
     */
    private static void listFile(File dir) throws IOException {
        File[] files = dir.listFiles();
        assert files != null;
        if (files.length == 0) {
            System.out.println("此目录为空");
            return;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                listFile(file);
                System.out.println("[是文件夹=>>>>>]" + file.getCanonicalPath());
            } else {
                System.out.println("[是文件==>>>>>>]" + file.getCanonicalPath());
            }
        }
    }

    /**
     * 使用字节流读文件
     *
     * @param dir
     * @return
     * @throws IOException
     */
    private static String readFileUseByte(File dir) throws IOException {
        /*
         * 1、File对象还是Object对象
         * 2、流的方向
         * 3、使用字节流还是字符流
         */
        FileInputStream fileInputStream = new FileInputStream(dir);
        byte[] bytes = new byte[(int) dir.length()];
        fileInputStream.read(bytes);
        fileInputStream.close();
        return new String(bytes);
    }

    /**
     * 使用字符流读文件
     *
     * @param file
     * @return
     * @throws IOException
     */
    private static String readFileUseChar(File file) throws IOException {
        /*
         * 1、File对象还是Object对象
         * 2、流的方向
         * 3、使用字节流还是字符流
         */
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[(int) file.length()];
        fileReader.read();
        fileReader.close();
        return new String(chars);
    }

}
