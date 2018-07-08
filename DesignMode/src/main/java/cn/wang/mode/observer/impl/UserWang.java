package cn.wang.mode.observer.impl;
/**
 * 用户1-具体观察者1
 * @author wangfan
 * @Date 2018-07-06 18:53
 */
import cn.wang.mode.observer.jiekou.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class UserWang implements Observer,Serializable {
    private static final long serialVersionUID = -1824442207062409307L;
    Logger logger = LoggerFactory.getLogger(UserLiu.class);
    private String name;

    public UserWang(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String message) {
        logger.info(getName() + ":" +message);
    }
}
