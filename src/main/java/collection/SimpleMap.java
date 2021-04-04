package collection;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", "b");
        map.put("d", "b");
        map.put("q", "b");
        map.put("y", "b");
        System.out.println(map);
        //map中最典型的就是hashmap
        //hashmap的值是一个 entry 即kv对（entry<k,v>

        //k不可重复
        //如何计算重复 调用putVal方法 进去之后
        //hash冲突的时候会出一个指针指向下一个块（即形成链表），jdk1.8当链表延伸到第八个的时候会建一个红黑树
        //平衡二叉树是怎么查找底下元素：二分查找
        //
    }
}
