package com.itheima.Stream.myreflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //1.获取class字节码文件对象
        Class clazz = Class.forName("com.itheima.Stream.myreflect2.Student");

        //2.获取构造方法
//        Constructor[] cons1 = clazz.getConstructors();
//        for (Constructor con : cons1) {
//            System.out.println(con);
//        }

//        Constructor[] cons2 = clazz.getDeclaredConstructors();
//        for (Constructor constructor : cons2) {
//            System.out.println(constructor);
//        }

        Constructor con4 = clazz.getDeclaredConstructor(String.class, int.class);
//        int modifiers = con4.getModifiers();
//        System.out.println(modifiers);
//        Parameter[] parameters = con4.getParameters();
//        for (Parameter parameter : parameters) {
//            System.out.println(parameter);
//        }
        Student stu =(Student)con4.newInstance("张三", 23);
        System.out.println(stu);
    }
}
