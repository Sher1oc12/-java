package com.atguigu.java;

import org.junit.Test;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class StringMethodTest {
    /*
int length():返回字符串的长度: return value.length
char charAt(int index):返回某索引处的字符return value[index]
boolean isEmpty():判断是否是空字符串: return value.length == 0
String toLowerCase():使用默认语言环境，将String 中的所有字符转换为小写
String toUpperCase():使用默认语言环境，将String中的所有字符转换为大写
String trim():返回字符串的副本，忽略前导空白和尾部空白
boolean equals(Object obj):比较字符串的内容是否相同
boolean equalsIgnoreCase(String anotherString):与equals方法类似， 忽略大小写
String concat(String str):将指定字符串连接到此字符串的结尾。等价于用“+”
int compareTo(String anotherString):比较两个字符串的大小
String substring(int beginIndex): 返回一个新的字符串，它是此字符串的从
beginIndex开始截取到最后的一个子字符串。
String substring(int beginIndex, int endIndex) :返回一个新字符串，它是此字
符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。
     */
    @Test
    public void test1(){
            String s1 = "HelloWorld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));
//        System.out.println(s1.charAt(10));
        String s2 = s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s2);

        String s3 = " he  ll o   world   ";
        String s4 = s3.trim();
        System.out.println("-------"+s3+"-------");
        System.out.println(s4);
    }
    @ Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "abc";
        String s4 = s3.concat("def");
        System.out.println(s4);

        String s5 = "abc";
        String s6 = new String("abd");
        System.out.println(s5.compareTo(s6));

        String s7 = "北京尚硅谷教育";
        String s8 = s7.substring(2);
        System.out.println(s7);
        System.out.println(s8);
        String s9 = s7.substring(2, 5);
        System.out.println(s9);
    }

    /*
boolean endsWith(String suffix):测试此字符串是否以指定的后缀结束
boolean startsWith(String prefix):测试此字符串是否以指定的前缀开始
boolean startsWith(String prefix, int toffset):测试此字符串从指定索引开始的
子字符串是否以指定前缀开始
boolean contains(CharSequences):当且仅当此字符串包含指定的char值序列时，返回true
int indexOf(String str):返回指定子字符串在此字符串中第一次出现 处的索引
int indexOf(String str, int fromlndex):返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
int lastlndexOf(String str):返回指定子字符串在此字符串中最右边出现处的索引
int lastIndexOf(String str, int fromlndex):返回指定子字符串在此字符串中最后
一次出现处的索引，从指定的索引开始反向搜索
注: indexOf和lastlndexOf方法 如果未找到都是返回-1

     */
    @Test
    public void test3(){
        String str1 = "helloworld";
        boolean b1 = str1.endsWith("ld");
        System.out.println(b1);

        boolean b2 = str1.startsWith("He");
        System.out.println(b2);

        boolean b3 = str1.startsWith("ll",2);
        System.out.println(b3);
        String str2 = "wo";
        System.out.println(str1.contains(str2));
        System.out.println(str1.indexOf("lol"));

        System.out.println(str1.indexOf("lo",5));

        String str3 = "hellorworld";
        System.out.println((str3.lastIndexOf("or")));
        System.out.println((str3.lastIndexOf("or",6)));

//        什么情况下，index0f(str)和astIndex0f(str)返回值相同?
//        情况一：存在唯一的一个str.情况二:不存在str


    }
    /*
        替换：
String replace(char oldChar, char newChar):返回一个新的字符串，它是
通过用newChar替换此字符串中出现的所有oldChar得到的。
String replace(CharSequence target, CharSequence replacement):使
用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
String replaceAll(String regex, String replacement) :使用给定的
replacement替换此字符串所有匹配给定的正则表达式的子字符串。
String : replaceFirst(String regex, String replacement): 使用给定的
replacement替换此字符串匹配给定的正则表达式的第一个子字符串。
        匹配：
boolean matches(String regex):告知此字符串是否匹配给定的正则表达式。
        切片：
String[] split(String regex):根据给定正则表达式的匹配拆分此字符串。
String[] split(String regex, int limit): 根据匹配给定的正则表达式来拆分此
字符串，最多不超过limit个，如果超过了，剩下的全部都放到最后一个元素中。
         */
    @Test
    public void test4(){
        String str1 = "北京尚硅谷教育北京";
        String str2 = str1.replace('北', '东');

        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.replace("北京", "上海");
        System.out.println(str3);
        System.out.println("*******************");

    }

}
