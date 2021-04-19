package cn.wang.mode.proxymode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 房主
 * @author wangfan
 * @Date 2018-07-31 17:49
 */
public class HouseOwner implements Person {
    Logger logger = LoggerFactory.getLogger("HouseOwner.class");
    private String name;
    public HouseOwner(String name){
        this.name = name;
    }
    @Override
    public void sellHouse(String address) {
        logger.info(name + "出售"+address+"的房子");
    }
}
