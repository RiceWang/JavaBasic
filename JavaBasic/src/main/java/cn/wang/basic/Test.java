package cn.wang.basic;

import org.junit.Assert;

import java.util.Optional;

/**
 * @Author: wangfan
 * @Date: 2021/4/9
 */
public class Test {

    @org.junit.Test
    public void test1() {
        Optional opt = Optional.ofNullable("aaa");
        Assert.assertTrue(opt.get().equals("aaa"));

    }


    public static void main(String[] args) {

    }
}
