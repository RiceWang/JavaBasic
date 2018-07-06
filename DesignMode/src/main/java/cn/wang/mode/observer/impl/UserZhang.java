package cn.wang.mode.observer.impl;
/**
 * 用户3-具体观察者3
 * @author wangfan
 * @Date 2018-07-06 18:53
 */
import cn.wang.mode.observer.jiekou.Observer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserZhang implements Observer {
    Logger logger = LoggerFactory.getLogger(UserZhang.class);
    private String name;

    public UserZhang(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String message) {
        logger.info("{}========"+getName() + ":" +message,logger.getClass());
    }
}
