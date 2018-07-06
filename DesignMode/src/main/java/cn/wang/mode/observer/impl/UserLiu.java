package cn.wang.mode.observer.impl;
/**
 * 用户2-具体观察者2
 * @author wangfan
 * @Date 2018-07-06 18:53
 */
import cn.wang.mode.observer.jiekou.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserLiu implements Observer {
    Logger logger = LoggerFactory.getLogger(UserLiu.class);
    private String name;

    public UserLiu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String message) {
        logger.info(getName() + ":" +message);
    }
}
