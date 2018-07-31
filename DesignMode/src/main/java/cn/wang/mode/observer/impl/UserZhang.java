package cn.wang.mode.observer.impl;
/**
 * 用户3-具体观察者3
 * @author wangfan
 * @Date 2018-07-06 18:53
 */
import cn.wang.mode.observer.jiekou.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class UserZhang implements Observer,Serializable {
    private static final long serialVersionUID = 5860112567463044962L;
    Logger logger = LoggerFactory.getLogger(UserZhang.class);
    private String name;

    public UserZhang(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void update(String message) {
        logger.info("{}========"+getName() + ":" +message,logger.getClass());
    }
}
