package thread.pool;

public class ThreadMain {//main方法在启动的时候也是一条线程在做，这个叫做主线程
    public static void main(String[] args){
//        Thread1 thread1 = new Thread1();
//        thread1.start();
        //这是安排给线程的事情
        Thread2 thread2=new Thread2();//初始化某个线程//这个线程可以称作主线程的一个子线程
        //这是将安排好的事情给线程去做
        Thread thread = new Thread(thread2);//把这个事情给传进去
        //启动线程去运行
        thread.start();
        System.out.println("aaaa");
    }
}
