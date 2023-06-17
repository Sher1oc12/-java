package com.atguigu.exer;

import org.junit.Test;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class StringDemo2 {
    /*
    获取两个字符串中最大相同子串。比如:
str1 = "abcwerthelloyuiodef";str2 = "cvhellobnm"
提示:将短的那个串进行长度依次递减的子串与较长的串比较。
     */
    public String getMaxSanmeString(String str1,String str2){
        if (str1 != null && str2 != null){
            String maxStr = str1.length() >= str2.length() ? str1 : str2;
            String minStr = str1.length() < str2.length() ? str1 : str2;
            int length = minStr.length();
            for (int i = 0; i < length; i++) {

                for (int x = 0,y=length - i;y<=length;x++,y++){
                    String subStr = minStr.substring(x, y);
                    if (maxStr.contains(subStr)){
                        return subStr;
                    }
                }
            }
        }
        return null;
    }
    @Test
    public void testGetMaxSameString(){
            String str1 = "abcwerthello1yuiodef";
            String str2 = "cvhello1bnm";
            String maxSameString = getMaxSanmeString(str1,str2);
        System.out.println(maxSameString);
    }
}

