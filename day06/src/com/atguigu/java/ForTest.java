package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 *
 * jdk 5.0新增了foreach循环，用于遍历集合、数组
 *
 *
 */
public class ForTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        //for(集合元素的类型 局部变量 : 集合对象  )
        for (Object obj : coll){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6};
//        for(数组元素的类型 局部变量 : 数组对象  )
        for (int i : arr){
            System.out.println(i);
        }
    }

    @Test
    public void test3(){

        String[] arr = new String[]{"MM","MM","MM"};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "GG";
//        }

        for (String s : arr){
            s = "GG";
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
