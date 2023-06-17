package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 * Collection接口中声明的方法的测试
 *
 * 向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals().
 */
public class CollectionTest {


    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);
//        Person p = new Person("jerry",20);
//        coll.add(p);

    coll.add(new Person("jerry",20));

        //contains(Object obj):判断当前集合中是否包含obj
        //我们在判断时会调用0bj对象所在类的equals()。
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));
        System.out.println(coll.contains(new Person("jerry",20)));

        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));
    }

    @Test
    public void test2(){
        //3.remove(0bject obj):
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        coll.remove(123);
        System.out.println(coll);

        coll.remove(new Person("jerry",20));
        System.out.println(coll);

//   4. removeAll(Collection coll1):差集:从当前集合中移除coll1中所有的元素
        Collection coll1 = Arrays.asList(123,456);
        coll.removeAll(coll1);
        System.out.println(coll);
    }
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

//retainALl(Collection coll1):交集: 获取当前集合和coll1集合的交集，并返回给当前集合
//        Collection coll1 = Arrays.asList(123,456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);

        //equals(Object obj):
        Collection coll2 = new ArrayList();
        coll2.add(456);
        coll2.add(123);
        coll2.add(new Person("jerry",20));
        coll2.add(new String("Tom"));
        coll2.add(false);

        System.out.println(coll.equals(coll2));
    }
    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

//        7.hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());

        //8.集合---->数组:toArray:
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //拓展:数组--->集合:调用Arrays类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);

        List arr1 = Arrays.asList(new int[]{123, 456});
        System.out.println(arr1.size());//1

        List arr2 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(arr2.size());//2

        //9.iterator():返回Iterator接口的实例，用于遍历集合元素。放在IteratorTest. java中测试
    }
}
