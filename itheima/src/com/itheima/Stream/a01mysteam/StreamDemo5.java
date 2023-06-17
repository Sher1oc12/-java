package com.itheima.Stream.a01mysteam;

import java.util.stream.Stream;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class StreamDemo5 {
//    一堆零散数据      public static<T> Stream<T> of(T... values)          Stream接口中的静态方法
public static void main(String[] args) {
    Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
    Stream.of("a","b","c","d","e").forEach(s -> System.out.println(s));

}
}
