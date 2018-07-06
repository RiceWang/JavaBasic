package cn.wang.mode.observer.jiekou;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题接口
 * @author wangfan
 * @Date 2018-07-06 18:53
 */
public interface Subject {
    public List<Observer> observerList = new ArrayList<Observer>();
    //注册观察者
    public void register(Observer observer);
    //移除观察者
    public void unregister(Observer observer);
    //通知观察者
    public void notified();

}
