package cn.wang.rateLimiter;

/**
 * @Author: wangfan
 * @Date: 2021/3/31
 */
public class FixedWindow {

    private int count;

    private long start = System.currentTimeMillis();

    public synchronized boolean grant(int internal, int limit) {
        long now = System.currentTimeMillis();
        if (now < internal + start) {
            count++;
            return count <= limit;
        } else {
            start = now;
            count = 1;
            return true;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        /**
         * 间隔时间
         */
        int internal = 1000;
        /**
         * 限制个数
         */
        int limit = 10;
        FixedWindow fixedWindow = new FixedWindow();
        for (int i = 0;i < 15;i++) {
            Thread t = new Thread(() -> {
                boolean flag = fixedWindow.grant(internal, limit);
                if (flag) {
                    System.out.println(Thread.currentThread().getName() + " 获得了资源,count = "+fixedWindow.count);
                } else {
                    System.out.println(Thread.currentThread().getName() + " 未获得了资源,count = "+fixedWindow.count);
                }
            });
            t.start();
        }

    }
}
