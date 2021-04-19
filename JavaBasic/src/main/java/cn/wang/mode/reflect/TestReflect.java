package cn.wang.mode.reflect;

import org.junit.Test;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 练习class.forname和classloader
 * @author wangfan
 * @Date 2018-07-13 11:42
 */
public class TestReflect {
    public void testReflect() {
        try {
            //会加载static模块
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection dm = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //不加载static模块
        ClassLoader c1 = ClassLoader.getSystemClassLoader();
        try {
            c1.loadClass("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
