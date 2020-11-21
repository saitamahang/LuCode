package com.liyuhang.ThinkingInJava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 通道拷贝文件测试
 * @author LiYuHang
 * @Date 2020/11/21
 */
public class ChannelCopy {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {
        String filePath_1 = "D:\\Code\\temp\\data.txt";
        String filePath_2 = "D:\\Code\\temp\\data_temp.txt";

        FileChannel fileInputChannel = new FileInputStream(filePath_1).getChannel();
        FileChannel fileOutPutChannel = new FileOutputStream(filePath_2).getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);

        while (fileInputChannel.read(byteBuffer) != -1) {
            // 读/写指针position指到缓冲区头部 为写文件做准备
            // flip()方法简单解析  https://blog.csdn.net/hbtj_1216/article/details/53129588
            byteBuffer.flip();
            fileOutPutChannel.write(byteBuffer);

            // clear()方法不会真正的删除掉buffer中的数据，只是把position移动到最前面，同时把limit调整为capacity
            // https://blog.csdn.net/qq_29102545/article/details/84306814
            byteBuffer.clear();
        }
    }
}
