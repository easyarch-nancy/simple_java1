package thread.pool;


//线程结束
public class ThreadJoin {
    private volatile static int i = 0;

    public static class ThreadAdd extends Thread {
        @Override//重写run方法
        public void run() {
            for (; i < 1000000000; i++) ;//循环这么多次然后把数加上去
        }

        public static void main(String[] args) throws InterruptedException {
            ThreadAdd threadAdd = new ThreadAdd();//新开一个线程做run方法里的事情
            threadAdd.start();
            //如果没有下面这一行，输出0或者一个很小的数，就是程序没有完全执行完就是先输出一个数然后再执行完这个程序
            threadAdd.join();
            //join加上后代表主线程要等待子线程执行完再继续，
            System.out.println(i);
        }
    }
}


