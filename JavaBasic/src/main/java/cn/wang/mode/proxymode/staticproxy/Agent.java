package cn.wang.mode.proxymode.staticproxy;

import cn.wang.mode.proxymode.Person;

/**
 * 中介
 * @author wangfan
 * @Date 2018-07-31 18:09
 */
public class Agent implements Person {
        private Person houseOwner;
        public Agent(Person houseOwner){
            this.houseOwner = houseOwner;
        }
    @Override
    public void sellHouse(String address) {
        houseOwner.sellHouse(address);
    }
}
