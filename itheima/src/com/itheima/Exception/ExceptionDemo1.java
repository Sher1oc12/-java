package com.itheima.Exception;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3,4,5,6};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        }
        System.out.println("123434执行");
    }
}
