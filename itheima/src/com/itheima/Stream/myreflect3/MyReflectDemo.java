package com.itheima.Stream.myreflect3;

import java.lang.reflect.Field;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {

        //1.获取class字节码文件的对象
        Class clazz = Class.forName("com.itheima.Stream.myreflect3.Student");
//          2.获取所有的成员变量获取成员变量
//        Field[] fields = clazz.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }


        //获取单个的成员变量
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);

        //获取权限修饰符
        int modifiers = name.getModifiers();
        System.out.println(modifiers);
        //获取成员变量的名字
        String name1 = name.getName();
        System.out.println(name1);

        //获取成员变量的名字
        Class<?> type = name.getType();
        System.out.println(type);

        //获取成员变量记录的值
        Student student = new Student("zhangsan", 23, "男");
        name.setAccessible(true);
        Object value = name.get(student);
        System.out.println(value);

        //修改对象里面记录的值
        name.set(student,"lisi");
        System.out.println(student);

    }
}
