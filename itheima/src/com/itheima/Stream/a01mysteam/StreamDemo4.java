package com.itheima.Stream.a01mysteam;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class StreamDemo4 {
    //数组            public static <T> Stream<T> stream(T[] array)     Arrays.工具类中的静态方法
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        String[] arr2={"a","b","c"};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
        Arrays.stream(arr2).forEach(s -> System.out.println(s));
        Stream.of(arr).forEach(s -> System.out.println(s));//[I@52cc8049
    }
}
