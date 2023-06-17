package com.atguigu.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class ReflectionTest {

    @Test
    public void test1(){
        Person p1 = new Person("tom",12);

        p1.age=10;
        System.out.println(p1.toString());
        p1.show();
    }
    @Test
    public void test2() throws Exception {
        Class<Person> clazz = Person.class;
        //1.通过反射，创建Person类的对象
        Constructor<Person> cons = clazz.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person)obj;
        System.out.println(obj.toString());
        //2.通过反射，调用对象指定的属性、方法
        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());

        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        //通过反射，可以调用Person类的私有结构的。比如:私有的构造器、方法、属性
        Constructor<Person> cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = (Person) cons1.newInstance("jerry");
        System.out.println(p1);

        //调用私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"hanmeimei");

        //调用私有的方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p1, "中国");
        System.out.println(nation);
    }
    /*
    疑问:通过直接new的方式或反射的方式都可以调用公共的结构，开发中到底用那个? .
    建议:直接new的方式。
    什么时候会使用:反射的方式。 反射的特征:动态性
    疑问2:反射机制与面向对象中的封装性是不是矛盾的?如何看待两个技术?

    关于java.Lang.Class类的理解
    1.类的加载过程:
程序经过javac.exe命令以后，会生成一个或多个字节码文件(.cLass结尾),
接着我们使用java.exe命令对某个字节码文件进行解释运行。相当于将某个字节码文件加载到内存中。
此过程就称为类的加载。加载到内存中的类，我们就称为运行时类，此运行时类，就作为CLass的一一个实例。

2.换句话说，Class 的实例就对应着一个运行时类。
3.加载到内存中的运行时类，会缓存一定的时间。在此时间之内，我们可以通过不同的方式
来获取此运行时类。

     */
    @Test
    public void test3() throws ClassNotFoundException {
        //方式一:调用运行时类的属性: .class
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);
        //方式二:通过运行时类的对象,调用getClass()
        Person p1 = new Person();
        Class<? extends Person> clazz2 = p1.getClass();
        System.out.println(clazz2);
//方式三:调用CLass的静态方法: forName (String classPath)
        Class clazz3 = Class.forName("com.atguigu.java.Person");
//        clazz3 = Class.forName("java.lang.String");
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);

    }
}
