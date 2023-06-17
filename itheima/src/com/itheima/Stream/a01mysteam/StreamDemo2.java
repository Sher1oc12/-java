package com.itheima.Stream.a01mysteam;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class StreamDemo2 {
    /*
    单列集合        default Stream<E> stream( )                        Collection中的默认方法
    双列集合        无                                                 无法直接使用stream流
    数组            public static <T> Stream<T> stream(T[] array)     Arrays.工具类中的静态方法
    一堆零散数据      public static<T> Stream<T> of(T... values)          Stream接口中的静态方法
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e");
        //!获取到--条流水线，并把集合中的数据放到流水线上
//        Stream<String> stream1 = list.stream();
//        stream1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                //s:以此表示流水线上每个数据
//                System.out.println(s);
//            }
//        });
        list.stream().forEach(s -> System.out.println(s));
    }
}
