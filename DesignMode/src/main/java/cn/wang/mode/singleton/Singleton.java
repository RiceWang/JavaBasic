package cn.wang.mode.singleton;

/**
 * 饿汉单例模式（立即加载）
 * 本身就是线程安全，但是静态常量如果没被调用，一直在占用资源
 * @author wangfan
 * @Date 2018-07-10 18:45
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return  instance;
    }
}
