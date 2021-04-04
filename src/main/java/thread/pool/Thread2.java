package thread.pool;

public class Thread2 implements Runnable {//Thread2里面就是线程要做的事

    @Override
    public void run() {//明确线程要干的事
        //打印出当前线程的名称
        //这个事情有了，我就要把这个事情安排给某个线程做
        String name = Thread.currentThread().getName();
        System.out.println("runnable test" + "------>" + name);
    }
}
