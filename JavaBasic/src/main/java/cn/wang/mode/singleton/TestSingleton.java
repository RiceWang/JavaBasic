package cn.wang.mode.singleton;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 测试单例模式
 * @author wangfan
 * @Date 2018-07-10 18:44
 */
public class TestSingleton {
    Logger logger = LoggerFactory.getLogger(TestSingleton.class);
    private static int THREAD_NUM = 10;
    private int i =0;
    @Test
    public  void testSingleton1(){
        System.out.println("Singleton1:==========");
        for(; i < THREAD_NUM; i++){
            Thread th = new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton1.getInstance();
                }
            });
            th .start();
        }
    }
//    public static void main(String[] args) {
//        System.out.println("Singleton1:==========");
//        for(int i = 0; i < THREAD_NUM; i++){
//            Thread th = new Thread() {
//                @Override
//                public void run() {
//                    Singleton1.getInstance();
//                }
//            };
//            th .start();
//        }
//        System.out.println("Singleton2:==========");
//        for(int i = 0; i < THREAD_NUM; i++){
//            Thread th = new Thread() {
//                @Override
//                public void run() {
//                    Singleton2.getInstance();
//                }
//            };
//            th .start();
//        }
//
//        System.out.println("Singleton3:==========");
//        for(int i = 0; i < THREAD_NUM; i++){
//            Thread th = new Thread() {
//                @Override
//                public void run() {
//                    Singleton3.getInstance();
//                }
//            };
//            th .start();
//        }
//
//        System.out.println("Singleton4:==========");
//        for(int i = 0; i < THREAD_NUM; i++){
//            Thread th = new Thread() {
//                @Override
//                public void run() {
//                    Singleton4.getInstance();
//                }
//            };
//            th .start();
//        }
//    }
}
