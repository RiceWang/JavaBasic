package cn.wang.mode.singleton;

/**
 * 多线程下的懒汉模式，线程安全
 * 但是其实只需要instance没有被创建时需要同步，以后就不需要同步。这种做法则每次都会同步，效率降低
 * @author wangfan
 * @Date 2018-07-10 18:38
 */
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){

    }
    public static synchronized Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return  instance;
    }
}
