package cn.wang.rateLimiter;

/**
 * @Author: wangfan
 * @Date: 2021/3/31
 */
public class FixedWindow {
    private long start = System.currentTimeMillis();
    /**
     * 间隔时间
     */
    private int internal = 1000;
    /**
     * 限制个数
     */
    private int limit = 10;

    private int count;

    public boolean grant() {
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
}
