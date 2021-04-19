package cn.wang.mode.proxymode.dynamicproxy;

import cn.wang.mode.proxymode.HouseOwner;
import cn.wang.mode.proxymode.Person;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wangfan
 * @Date 2018-07-31 18:39
 */
public class TestDynamic {
    @Test
    public void testDynamic(){
        Person person = new HouseOwner("刘先生");
        InvocationHandler h = new DynamicAgent(person);
        Person proxyInstance = (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),h);
        proxyInstance.sellHouse("静安里");
    }
}
