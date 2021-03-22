package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SimpleSet {
    public static void main(String[] args){
        Set hashSet=new HashSet();//不重复且无序的集合
        Set treeSet=new TreeSet();
//        hashSet.add("t");
//        hashSet.add("i");//add还有一个返回值
//        boolean q= hashSet.add("i");
//        q= hashSet.add("i");//这个东西可以用来去重，打断点后发现第一个q=i是true 后面继续为false
//        hashSet.add("o");
//        hashSet.add("q");
//        hashSet.add("q");
//        hashSet.add("q");
//        hashSet.add("q");//运行结果没有重复
//        System.out.println(hashSet);//运行结果顺序跟我们想象的不一样


        treeSet.add("t");//按照字母ASCII先后顺序排序，有序集合且不重复
        treeSet.add("i");
        treeSet.add("o");
        treeSet.add("q");
        treeSet.add("q");
        treeSet.add("q");
        treeSet.add("q");
        System.out.println(treeSet);
    }
}
