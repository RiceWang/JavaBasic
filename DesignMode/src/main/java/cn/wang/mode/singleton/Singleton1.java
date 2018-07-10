package cn.wang.mode.singleton;

/**
 * 单线程下的懒汉模式，线程不安全
 * @author wangfan
 * @Date 2018-07-10 18:38
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){

    }
    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return  instance;
    }
}
