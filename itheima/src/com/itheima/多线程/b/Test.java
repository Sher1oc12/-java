package com.itheima.多线程.b;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,2,7,200,1,3,8,2000,203);

        MyThread t1 = new MyThread(list);
        MyThread t2 = new MyThread(list);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();
    }
}
