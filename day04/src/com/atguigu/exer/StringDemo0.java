package com.atguigu.exer;

import jdk.jfr.StackTrace;
import org.junit.Test;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class StringDemo0 {

/* 将一个字符串进行反转。将字符串中指定部分进行反转。比如*abcdefg"反 转为"abfedcg”
方式一：转换为char[]

 */
    public String reverse(String str,int startIndex,int endIndex){

        if (str != null){
            char[] arr = str.toCharArray();
            for (int x = startIndex,y = endIndex;x<y;x++,y--){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }
    @Test
    public void testReverse(){
        String str = "abcdefg";
        String reverse = reverse2(str,2,5);
        System.out.println(reverse);
    }
    //方式二：使用String的拼接
    public String reverse1(String str,int startIndex,int endIndex){

        if (str!=null){
            String reverStr = str.substring(0,startIndex);

            for (int i = endIndex;i>=startIndex;i--){
                reverStr += str.charAt(i);
            }
            reverStr+=str.substring(endIndex+1);

            return reverStr;
        }
        return null;
    }
//    方式三:使用StringBuffer/StringBuilder替换String
public String reverse2(String str,int startIndex,int endIndex){
        if (str!=null){
            StringBuilder builder = new StringBuilder(str.length());
            builder.append(str.substring(0,startIndex));
            for (int i = endIndex;i>=startIndex;i--){
                builder.append(str.charAt(i));
            }
            builder.append(str.substring(endIndex+1));

            return builder.toString();
        }
        return null;
}
}
