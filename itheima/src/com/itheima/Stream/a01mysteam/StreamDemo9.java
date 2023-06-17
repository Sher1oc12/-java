package com.itheima.Stream.a01mysteam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张翠山","张良","王二麻子","谢广坤");

//        list.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        list.stream().forEach(s-> System.out.println(s));
//   count() 统计
        long count = list.stream().count();
        System.out.println(count);
//        toArray( )        收集流中的数据，放到数组中
        Object[] arr1 = list.stream().toArray();
        System.out.println(Arrays.toString(arr1));

        //IntFunction的泛型: 具体类型的数组
        //apply的形参:流中数据的个数，要跟数组的长度保持-“致
        //apply的返回值:具体类型的数组
        //方法体:就是创建数组

// toArray方法的参数的作用:负贵创建一个指定类型的数组
//toArray.方法的底层，会依次得到流里面的每一个数据，并把数据放到数组当中
//toArray.方法的返回值:是-一个装着流里面所有数据的数组
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
