package thread.pool;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMultiThread {
    //    static Vector<Integer>list = new ArrayList<Integer>();
    static List<Integer> list = new ArrayList<Integer>();//循环往这里面塞元素

    public static class AddThread implements Runnable {
        @Override
        public void run() {
//            synchronized (list) {
            for (int i = 0; i < 1000000; i++) {
                synchronized (list) {
                    list.add(i);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new AddThread());
        Thread t2 = new Thread(new AddThread());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(list.size());

    }
}
//期望结果是加完到两千 实际上报错了 并且没有输出我们想要的,
// 原因是第一个线程扩容了第二个线程过来的时候发现已经扩容了，使用时就会出错，
//锁粒度问题：锁细不锁粗
//容器替换：Vector ：所有的操作都会加锁。效率低下 但是线程安全性比较好现在不咋用了


