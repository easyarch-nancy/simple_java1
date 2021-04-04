package thread.pool;


//线程等待和线程通知
//开两个线程 让两个线程有一定交互
public class WaitAndNodify {//wait能做线程等待和通知
    static final Object obj = new Object();

    public static class T1 extends Thread {
        @Override
        public void run() {
            synchronized (obj) {//申请了一个锁 目的允许操作object对象 object可以调用wait来停止这个T1线程
                System.out.println(System.currentTimeMillis() + "---->T1 start");
                try {
                    System.out.println(System.currentTimeMillis() + "---->T1 wait");
                    //当对象实例调用wait方法，当前持有 或者在运行这个对象的线程就会停止 转到等待的一个状态
                    //直到持有对象的另一个线程调用nodify时就会结束
                    obj.wait();//线程等待，t1进入等待后，会释放原来锁 以便让其他线程能拿到
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis() + "---->T1 end");
            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            //t1释放锁 t2就能拿到这把锁
            synchronized (obj) {//synchronized就是锁 所有wait和notify都是建立在加锁的状态下
                System.out.println(System.currentTimeMillis() + "---->T2 start notify T1");
                obj.notify();//线程通知//唤醒持有这个对象的其他线程，当2唤醒1后锁又回到了1手里
                obj.notifyAll();
                System.out.println(System.currentTimeMillis() + "---->T2 end");
                try {
                    Thread.sleep(2000);//让t2线程停顿两秒，就能明显说明当notify线程后t1被唤醒从而t2结束 t1也跟着结束
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {//从main进入
        Thread t1 = new T1();
        Thread t2 = new T2();//开启两个线程 一个T1 一个T2 都重写了里面的run方法
        t1.start();
        t2.start();
    }

}

