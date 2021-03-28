package thread.pool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalDemo {
//    private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //ThreadLocal线程的本地局部变量
    private static ThreadLocal<SimpleDateFormat> t1=new ThreadLocal<>();
    public static class ParseDate implements Runnable{
        int i=0;
        public void ParseData(int i){this.i=i;}
        @Override
        public void run(){
            try{

                //set 进去先获得当前线程对象 拿到map 后去设置一个值  具体看源码
                if(t1.get()==null){
                    t1.set(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
                }
                Date time = t1.get().parse("2019-12-01 10:00:" + i % 60);
//                Date time = sdf.parse("2019-12-01 10:00:" + i % 60);
                System.out.println(i+"--->"+time);

            }catch(ParseException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        for(int i=0;i<1000;i++){
            threadPool.submit(new ParseDate());
        }

    }
}
