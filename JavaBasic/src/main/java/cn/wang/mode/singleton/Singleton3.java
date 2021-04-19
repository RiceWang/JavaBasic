package cn.wang.mode.singleton;

/**
 * 双重检验锁，线程安全（延迟加载）
 * instance == null  判断两次
 * @author wangfan
 * @Date 2018-07-10 18:38
 */
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){
        System.out.println("Singleton3:创建一个对象");
    }
    public static  Singleton3 getInstance(){
        if(instance == null){
            synchronized (Singleton3.class){
                if(instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return  instance;
    }
}
