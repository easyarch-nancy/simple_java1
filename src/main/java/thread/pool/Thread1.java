package thread.pool;

//线程
//要使用一个线程 就要让他知道当前线程所要做的事情是什么，第二步才是打开这个线程
//让这个线程开始做你指定他做的事情
public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("aaaaa");
    }
}
