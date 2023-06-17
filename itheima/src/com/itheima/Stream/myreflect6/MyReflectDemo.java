package com.itheima.Stream.myreflect6;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class MyReflectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*
        反射可以跟配置文件结合的方式，动态的创建对象，并调用方法
         */
        //1，读取配置文件中的信息
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\邱锦洋\\IdeaProjects\\5_13\\itheima\\prop.properties");
        properties.load(fileInputStream);
        fileInputStream.close();
        System.out.println(properties);
        //2.获取全类名和方法名
        String classname = (String) properties.get("classname");
        String methodname = (String) properties.get("method");
        System.out.println(classname);
        System.out.println(methodname);
        //3.利用放射创建对象并运行方法
        Class<?> aClass = Class.forName(classname);
        //获取构造方法
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        Object o = declaredConstructor.newInstance();
        System.out.println(o);
        //获取成员方法并运行

        Method declaredMethod = aClass.getDeclaredMethod(methodname);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(o);

    }
}
