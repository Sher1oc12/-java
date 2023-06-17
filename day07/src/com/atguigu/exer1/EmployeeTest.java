package com.atguigu.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 *
 *
 * *创建该类的5个对象，并把这些对象放入TreeSet集合中(下-章: TreeSet 需使用泛型来定义)
 * 分别按以下两种方式对集合中的元素进行排序，并遍历输出:
 * 1).使Employee 实现Comparable 接口，并按name排序
 * 2). 创建TreeSet 时传入Comparator对象， 按生日日期的先后排序。
 */
public class EmployeeTest {

    //问题二:按生日日期的先后排序。
    @Test
    public void test2(){

        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee &&o2 instanceof Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    Mydate b1 = e1.getBirthday();
                    Mydate b2 = e2.getBirthday();
//方式一
//                    //比较年
//                    int minusYear = b1.getYear() - b2.getYear();
//                    if (minusYear != 0){
//                        return minusYear;
//                    }
//                    //比较月
//                    int minusMonth = b1.getMonth() - b2.getMonth();
//                    if (minusMonth != 0){
//                        return minusMonth;
//                    }
//                    //比较日
//                    return b1.getDay()-b2.getDay();

                    //方式二
                    return b1.compareTo(b2);
                }
                throw new RuntimeException("传入的数据类型不一致");
            }
        });

        Employee e1 = new Employee("liudehua",55,new Mydate(1965,5,4));
        Employee e2 = new Employee("zhangxueyou",43,new Mydate(1987,5,4));
        Employee e3 = new Employee("guofucheng",44,new Mydate(1987,5,9));
        Employee e4 = new Employee("liming",51,new Mydate(1954,8,12));
        Employee e5 = new Employee("liangchaowei",21,new Mydate(1978,12,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    //问题一:使用自然排序
    @Test
    public void test1(){
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("liudehua",55,new Mydate(1965,5,4));
        Employee e2 = new Employee("zhangxueyou",43,new Mydate(1987,5,4));
        Employee e3 = new Employee("guofucheng",44,new Mydate(1987,5,9));
        Employee e4 = new Employee("liming",51,new Mydate(1954,8,12));
        Employee e5 = new Employee("liangchaowei",21,new Mydate(1978,12,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
