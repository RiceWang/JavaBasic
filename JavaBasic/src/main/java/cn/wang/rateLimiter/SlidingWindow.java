package cn.wang.rateLimiter;

/**
 * @Author: wangfan
 * @Date: 2021/4/6
 */
public class SlidingWindow {

    class Node {
        private long time;
        private int counter;
        private Node next;
        public Node(long time, int counter) {
            this.time = time;
            this.counter = counter;
        }
    }

    /**
     * 间隔时间
     */
    int internal = 1000;
    /**
     * 限制个数
     */
    int limit = 10;

    int slot = 10;

    int slotTime = internal / slot;

    Node lastNode;

    public boolean grant() {

        return true;
    }

    public void init() {
        Node currentNode = null;
        long current = System.currentTimeMillis();
        for (int i = 0 ;i < slot; i++) {
            if (lastNode == null) {
                lastNode = new Node(current, 0);
            } else {
                currentNode = new Node(current, 0);
                lastNode.next =  currentNode;
                lastNode = lastNode.next;
            }
        }

    }

    public static void main(String[] args) {
        SlidingWindow slidingWindow = new SlidingWindow();
        slidingWindow.init();

    }


}
