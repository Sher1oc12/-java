package com.itheima.多线程.a;

import java.util.Random;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class MyThread extends Thread{
    static double money = 100;
    static int count =3;

    static final double MIN= 0.01;

    @Override
    public void run() {
        synchronized (MyThread.class){
            if (count == 0){
                System.out.println(getName()+"没有抢到红包！");
            }else {
                double prize = 0;
                if (count ==1){
                    prize =money;
                }else {
                    Random r = new Random();
                    double bounds = money - (count - 1) * MIN;
                     prize = r.nextDouble();
                     if (prize < MIN){
                         prize = MIN;
                     }
                }
                money =money - prize;
                count--;
                System.out.println(getName()+"抢到了"+prize+"元");
            }
        }
    }
}
