package cn.wang.mode.proxymode.dynamicproxy;

import cn.wang.mode.proxymode.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理需要一个实现InvocationHandler接口的类
 * @author wangfan
 * @Date 2018-07-31 18:31
 */
public class DynamicAgent implements InvocationHandler {
    //被代理的实例
    private Person person;
    public DynamicAgent(Person person){
        this.person = person;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(person,args);
        return result;
    }
}
