package cn.wang.mode.observer.impl;

import cn.wang.mode.observer.jiekou.Observer;
import cn.wang.mode.observer.jiekou.Subject;

import java.util.List;

/**
 * 报纸类--主题实现
 * @author wangfan
 * @Date 2018-07-06 19:10
 */
public class Paper implements Subject {
    public void register(Observer observer) {
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    public void notified() {
        for(Observer observer : observerList){
            observer.update("报纸修改了信息");
        }
    }
}
