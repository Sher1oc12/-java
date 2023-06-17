package com.atguigu.java;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 *
 * Collections:操作Collection. Map的工具类
 *
 * 面试题: Collection 和Collections的区别?
 *
 *
 *reverse(List):反转List中元素的顺序
 * shuffle(List):对List集合元素进行随机排序
 * sort(List):根据元素的自然顺序对指定List集合元素按升序排序
 * sort(List, Comparator): 根据指定的Comparator产生的顺序对List集合元素进行排序
 * swap(List，int，int): 将指定list 集合中的i处元素和j处元素进行交换
 */
public class CollectionsTest {
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-97);
        list.add(0);
        System.out.println(list);

        Collections.reverse(list);
        Collections.shuffle(list);
        Collections.sort(list);
        Collections.swap(list,1,2);
        List dest = Arrays.asList(new Object[list.size()]);
        Collections.copy(dest,list);
        System.out.println(dest);
        System.out.println(list);
    }
}
