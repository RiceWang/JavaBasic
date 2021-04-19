package cn.wang.mode.observer.jiekou;

/**
 * 观察者接口
 * @author wangfan
 * @Date 2018-07-06 18:53
 */
public interface Observer {
    /**
     * 更新信息
     * @param message
     */
    public void update(String message);
}
