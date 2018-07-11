package cn.wang.mode.singleton;

/**
 * 静态内部类加载，线程安全（延迟加载）
 * 既使用了懒加载（静态内部类在调用getInstance()时才会加载），又不用synchronized关键字控制线程安全
 * @author wangfan
 * @Date 2018-07-10 18:38
 */
public class Singleton4 {
    private static class Holder {
        private static Singleton4 instance = new Singleton4();
    };
    private Singleton4(){
        System.out.println("Singleton4:创建一个对象");
    }
    public static Singleton4 getInstance(){
        return  Holder.instance;
    }
}
