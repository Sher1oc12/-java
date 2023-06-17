package com.itheima.jiekou;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public interface Inter {

    void method();

    default void show(){
        System.out.println("接口中的默认方法------show");
    }
}
