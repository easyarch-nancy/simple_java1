package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SimpleList {
    public static void main(String[] args) {
        //数组实现，可以放重复数据
        List arrayList = new ArrayList();
        //链表实现
        List linkedList = new LinkedList();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            arrayList.add(1);//arrayList中可存放重复数据
        }
        System.out.println(arrayList);
        //能不能看到结果取决于toString方法 所以我们要看一下ArrayList的toString方法是怎么写的
//链表和数组都一样，运行结果都是以数组开头，他们都有一个共同的父类，父类里都实现了toString方法

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);
//        delList();
    }


    private static void delList() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

    }
}