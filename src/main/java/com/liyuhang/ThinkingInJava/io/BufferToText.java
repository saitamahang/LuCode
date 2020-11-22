package com.liyuhang.ThinkingInJava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * 通道拷贝文件测试
 * @author LiYuHang
 * @Date 2020/11/22
 */
public class BufferToText {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {
        String filePath = "D:\\Code\\temp\\data2.txt";
        FileChannel fileChannel = new FileOutputStream(filePath).getChannel();
        fileChannel.write(ByteBuffer.wrap("Some Text".getBytes()));
        fileChannel.close();

        fileChannel = new FileInputStream(filePath).getChannel();

        // 分配一个新的字节缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);
        fileChannel.read(byteBuffer);
        byteBuffer.flip();
        System.out.println(byteBuffer.asCharBuffer());

        // 倒带这个缓冲区。位置被设置为零，标记被丢弃。
        byteBuffer.rewind();
        String encoding = System.getProperty("file.encoding");
        System.out.println("Decoded using " + encoding + " : " + Charset.forName(encoding).decode(byteBuffer));

        fileChannel = new FileOutputStream(filePath).getChannel();
        fileChannel.write(ByteBuffer.wrap("Some Text".getBytes(encoding)));
        fileChannel.close();

        fileChannel = new FileInputStream(filePath).getChannel();
        byteBuffer.clear();
        fileChannel.read(byteBuffer);
        byteBuffer.flip();
        System.out.println(byteBuffer.asCharBuffer());

        fileChannel = new FileOutputStream(filePath).getChannel();
        byteBuffer = ByteBuffer.allocate(24);
        byteBuffer.asCharBuffer().put("Some Text");
        fileChannel.write(byteBuffer);
        fileChannel.close();

        fileChannel = new FileInputStream(filePath).getChannel();
        byteBuffer.clear();
        fileChannel.read(byteBuffer);
        byteBuffer.flip();
        System.out.println(byteBuffer.asCharBuffer());
    }
}
