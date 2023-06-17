package com.itheima.多线程.b;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class MyThread extends Thread {
    ArrayList<Integer> list;

    public MyThread( ArrayList<Integer> list){
        this.list=list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class){
                if (list.size() == 0){
                    break;
                }else {
                    Collections.shuffle(list);
                   int prize = list.remove(0);
                    System.out.println(getName()+"又产生了"+prize+"元大奖");
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
