package cn.wang.io;

import java.io.*;

/**
 * @author wangfan
 * @Date 2018-08-07 18:20
 */
public class StreamTest {

    public static void main(String[] args) {
        FileInputStream in = null;
        try {
            in = new FileInputStream("d:/stream.txt");
            int b;
            byte[] bytes = new byte[120];
            while ((b = in.read(bytes)) != -1){
                String by = new String(bytes);
                System.out.println(by);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("======================================");
        String hello = "hello outputStream";
        try {
            FileOutputStream os = new FileOutputStream("d:/streamOut.txt");
            byte[] bytes = hello.getBytes();
            for(int i = 0;i < bytes.length;i++){
                os.write(bytes[i]);
            }
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
