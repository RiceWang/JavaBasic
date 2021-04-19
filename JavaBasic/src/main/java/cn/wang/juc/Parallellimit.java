package cn.wang.juc;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: wangfan
 * @Date: 2021/4/1
 */
public class Parallellimit {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        CountDownLatch cdl = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            CountRunnable runnable = new CountRunnable(cdl);
            pool.execute(runnable);
        }
    }
    Object o = new Object();
    public void  method() {
        synchronized (o) {
            System.out.println("1111");
            System.out.println("222");
            System.out.println("333");
        }

    }

}

class CountRunnable implements Runnable {
    private CountDownLatch countDownLatch;
    public CountRunnable(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        try {
            synchronized (countDownLatch) {
                /*** 每次减少一个容量*/
                countDownLatch.countDown();
                System.out.println("thread name = " + Thread.currentThread().getName());
                System.out.println("thread counts = " + (countDownLatch.getCount()));
            }
            countDownLatch.await();
            System.out.println("concurrency counts = " + (100 - countDownLatch.getCount()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
