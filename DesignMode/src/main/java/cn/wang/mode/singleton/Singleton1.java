package cn.wang.mode.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单线程下的懒汉模式，线程不安全（延迟加载）
 * @author wangfan
 * @Date 2018-07-10 18:38
 */
public class Singleton1 {
    Logger logger = LoggerFactory.getLogger(Singleton1.class);
    private static Singleton1 instance;
    private Singleton1(){
        System.out.println("Singleton1:创建一个对象");
    }
    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return  instance;
    }
}
