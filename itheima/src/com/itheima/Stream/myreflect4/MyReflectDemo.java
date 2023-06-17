package com.itheima.Stream.myreflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*
利用反射获取成员方法
Class类中用于获取成员方法的方法
Method[] getMethods():返回所有公共成员方法对象的数组，包括继承的
Method[] getDeclaredMethods():返回所有成员方法对象的数组，不包括继承的
Method getMethod(String name, Class<>... parameterTypes):返回单个公共成员方法对象
Method getDeclaredMethod(String name, Class<?... parameterTypes):返回单个成员方法对象

         */

        //1.获取class字节码文件对象
        Class<?> clazz = Class.forName("com.itheima.Stream.myreflect4.Student");

        //2.获取里面所有的方法对象(包含父类中所有的公共方法)
//        Method[] methods = clazz.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }
        //获取里面所有的方法对象(不能获取父类的，但是可以获取本类中私有的)
//        Method[] methods = clazz.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }

        //获取指定指定的单一方法
  Method m = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(m);

        //获取方法的修饰符
        int modifiers = m.getModifiers();
        System.out.println(modifiers);
        //获取方法的名字
        String name = m.getName();
        System.out.println(name);
        //获取方法的形参
        Parameter[] parameters = m.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        //获取方法抛出的异常
        Class<?>[] exceptionTypes = m.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }
        //方法运行
/*Method类中用于创建对象的方法
Object invoke(0bject obj, object... args): 运行方法
参数一:用obj对象调用该方法
参数二:调用方法的传递的参数(如果没有就不写)
返回值:方法的返回值(如果没有就不写) */

        Student s = new Student();
        //参数一s：表示方法的调用者
        //参数二”hangbao“：表示在调用方法的时候传递的实际参数
        m.setAccessible(true);
        m.invoke(s,"hangbao");
        //获取方法的返回值

    }
}
