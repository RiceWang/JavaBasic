package cn.wang.mode.proxymode;

import cn.wang.mode.proxymode.staticproxy.Agent;
import org.junit.Test;

/**
 * @author wangfan
 * @Date 2018-07-31 18:17
 */
public class TestStatic {
    @Test
    public void testStatic(){
        HouseOwner houseOwner = new HouseOwner("刘先生");
        Agent agent = new Agent(houseOwner);
        agent.sellHouse("和平里");
    }
}
