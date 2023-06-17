package com.itheima.Stream.myreflect1;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class MyaReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
//      第一种方式
//      全类名:包名+类名com.itheima.myreflect1.Student
        Class clazz1 = Class.forName("com.itheima.Stream.myreflect1.Student");
        System.out.println(clazz1);

        //第二种方式
        Class clazz2 = Student.class;


        //第三种方式
        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz1==clazz2);
        System.out.println(clazz2==clazz3);
    }
}
