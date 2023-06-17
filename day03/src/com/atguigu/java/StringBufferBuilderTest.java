package com.atguigu.java;

import org.junit.Test;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 * 关于StringBuffer和StringBuilder的使用
 */
public class StringBufferBuilderTest {
    /*
    String、StringBuffer、 StringBuilder三者的异同?
    String:不可变的字符序列;底层使用char[]存储
    StringBuffer:可变的字符序列;线程安全的，效率低;底层使用char[]存储
    StringBuilder:可变的字符序列;jdk5.0新增的，线程不安全的，效率高;底层使用char[]存储

     */
    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.length());
    }
    /*
    StringBuffer的常用方法:
StringBuffer append(xxx):提供了很多的append()方法，用于进行字符串拼接
StringBuffer delete(int start,int end):删除指定位置的内容
StringBuffer replace(int start, int end, String str):把[start,end)位 置替换为str
StringBuffer insert(int offset, XXX):在指定位置插入xXx
StringBuffer reverse() :把当前字符序列逆转
public int indexOf(String str)
public String substring(int start,int end)
public int length()
public char charAt(int n )
public void setCharAt(int n char ch)
总结:
增: append(xxx)
删: delete(int start, int end)
改: setCharAt(int n ,char ch) / replace(int start, int end, String str)
查: charAt(int n )
插: insert(int offset, xxx)
长度: Length();
遍历: for + charAt()


     */
    @Test
    public void test2(){
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('1');
        System.out.println(s1);
//        s1.delete(2,4);
//        s1.replace(2,4,"hello");
//        s1.insert(2,false);
//        s1.reverse();
        String s2 = s1.substring(1, 3);
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s2);

    }
    /*
    对比String、StringBuffer、StringBuilder三者的效率:

     */
}
