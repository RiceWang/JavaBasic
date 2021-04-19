package cn.wang.mode.observer;

import cn.wang.mode.observer.impl.Paper;
import cn.wang.mode.observer.impl.UserLiu;
import cn.wang.mode.observer.impl.UserWang;
import cn.wang.mode.observer.impl.UserZhang;
import cn.wang.mode.observer.jiekou.Observer;
import cn.wang.mode.observer.jiekou.Subject;

import java.util.List;

/**
 * @author wangfan
 * @Date 2018-07-06 19:27
 */
public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new Paper() ;
        Observer wang = new UserWang("wang");
        Observer liu = new UserLiu("liu");
        Observer zhang = new UserZhang("zhang");
        subject.register(wang);
        subject.register(liu);
        subject.register(zhang);
        subject.notified();
    }
}
