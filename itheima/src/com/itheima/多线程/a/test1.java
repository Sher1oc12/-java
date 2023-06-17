package com.itheima.多线程.a;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class test1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();

        t1.setName("aa");
        t2.setName("bb");
        t3.setName("cc");
        t4.setName("dd");
        t5.setName("ee");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
