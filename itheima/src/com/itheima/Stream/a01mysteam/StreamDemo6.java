package com.itheima.Stream.a01mysteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class StreamDemo6 {
    public static void main(String[] args) {
        /*
        filter      过滤
        limit       获取前几个元素
        skip        跳过前几个元素.
注意1:中间方法，返回新的Stream流，原来的Stream流只能使用一一次， 建议使用链式编程
注意2:修改Stream流中的数据， 不会影响原来集合或者数组中的数据
         */
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌-12","张无忌-23","张无忌-232","周芷若-23","赵敏-45","张强-235","张三丰-4545","张翠山-232","张良-576","王二麻子-78","谢广坤-67");
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张");
//            }
//        }).forEach(s-> System.out.println(s));

//        Stream<String> stream1 = list.stream().filter(s -> s.startsWith("张"));
//        Stream<String> stream2 = stream1.filter(s -> s.length() == 3);
//        stream2.forEach(s-> System.out.println(s));

//        limit获取前几个元素
//        list.stream().limit(3).forEach(s-> System.out.println(s));
//skip跳过 前几个元素
//        list.stream().skip(2).forEach(s-> System.out.println(s));
//        list.stream().limit(4).skip(2).forEach(s-> System.out.println(s));
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"周芷若","赵敏");
        //distinct 去重
//        list1.stream().distinct().forEach(s-> System.out.println(s));
//concat  合并a和b两个流为- -个流
//        Stream.concat(list1.stream(),list2.stream()).forEach(s-> System.out.println(s));
        //map           转换流中的数据类型
        //注意1:中间方法，返回新的Stream流，原来的Stream流只能使用一次， 建议使用链式编程
        //注意2:修改Stream流中的 数据，不会影响原来集合或者数组中的数据
        list1.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s){
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s-> System.out.println(s));


        list1.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));

    }

}
