package cn.wang.juc;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: wangfan
 * @Date: 2021/4/16
 */
public class TestReentrantLock {
    ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {
        TestReentrantLock aa = new TestReentrantLock();
        Thread t1 = new Thread(() -> {
            aa.tryLock();
        });
        Thread t2 = new Thread(() -> {
            aa.tryLock();
        });
        t1.start();
        t2.start();

    }

    public void tryLock() {
        lock.lock();
        try {
            System.out.println(lock.getHoldCount());
            System.out.println(Thread.currentThread().getName() + " 获得了锁");
        } catch (Exception e) {

        }finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName() + " 释放了锁");
        }
    }
 }
