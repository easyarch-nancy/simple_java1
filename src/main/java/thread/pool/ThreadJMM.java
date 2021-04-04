package thread.pool;


public class ThreadJMM {
    //volatile 加上后就立即刷新缓存，没有的话就不会立即刷新缓存 有可能很快 有肯能满 就容易造成数据错乱

    private volatile static boolean initData = false;

    private static void refresh() {//把值改true
        System.out.println("change data");
        initData = true;
    }

    private static void loadData() {
        while (!initData) {//如果当前这个值一直false 那就一直循环，变true就出来了
            System.out.println("wait wait");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("数据initData被改变------");
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {//一条线程
            @Override
            public void run() {
                loadData();
            }
        }, "t1").start();

 /*       try{
            Thread.sleep((3000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
*/
        new Thread(new Runnable() {//两条线程
            @Override
            public void run() {
                refresh();
            }
        }, "t2").start();
    }
}


