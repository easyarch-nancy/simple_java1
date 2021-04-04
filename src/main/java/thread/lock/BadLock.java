package thread.lock;
//锁是为了保证线程安全
//比如这个程序中如果把锁去掉，本来这个程序是想要一个线程加10000000次，去掉后加不到两千万
//为啥嘞？两个线程共用一个变量，会产生冲突
//t1，t2同时读取i，然后加一，然后写会内存中，两个线程都加一 因为他们是独立的个体，所以就只有一
//必须保证两个线程是一个同步的操作，当线程t1写入时，t2不写，t1写完后，t2写
//达到每一次只有一个线程进去读写
//所以就引入了synchronized，就可以做到上面所说的
//synchronized用法：
// 1.指定加锁对象：表示进入加锁后的代码块中，需要获得指定对象的锁；
// 2.用于某个实例方法上，相当于对该实例加锁，能够调用这个方法之前必须获得该实例的锁。
// 3.用于某个静态方法，相当于对类加锁，能够调用类中的方法，使用类中的属性，都必须先获得这个类的锁。


public class BadLock implements Runnable {
    public static Integer i = 0;
    private static BadLock badLock = new BadLock();

    @Override
    public void run() {
        for (int j = 0; j < 10000000; j++) {
            synchronized (badLock) {//锁
                i++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(badLock);
        Thread t2 = new Thread(badLock);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);

    }
}
