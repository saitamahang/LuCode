package com.liyuhang.ThinkingInJava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 文件通道测试
 * @author LiYuHang
 * @Date 2020/11/21
 */
public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {

        String filePath = "D:\\Code\\temp\\data.txt";
        // 写文件
        FileChannel fileChannel = new FileOutputStream(filePath).getChannel();
        fileChannel.write(ByteBuffer.wrap("Some text".getBytes()));
        fileChannel.close();

        // 在文件底部添加内容
        fileChannel = new RandomAccessFile(filePath, "rw").getChannel();
        fileChannel.position(fileChannel.size());
        fileChannel.write(ByteBuffer.wrap("Some more".getBytes()));
        fileChannel.close();


        // 读文件
        fileChannel = new FileInputStream(filePath).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);
        fileChannel.read(byteBuffer);
        byteBuffer.flip();
        while (byteBuffer.hasRemaining()) {
            System.out.print((char)byteBuffer.get());
        }
    }

}
