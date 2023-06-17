package com.itheima.Exception;

import java.util.Scanner;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GirlFriend girlFriend = new GirlFriend();
        while (true) {
            try {
                System.out.println("请输入心仪女生的名字");
                String name = sc.nextLine();
                girlFriend.setName(name);
                System.out.println("请输入心仪女生的年龄");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                girlFriend.setAge(age);
                //如果所有数据都是正确的，那么跳出循环
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄的格式有误，请输入数字");
                continue;
            }catch (RuntimeException e) {
                System.out.println("姓名的长度或者年龄的范围有误");
                continue;
            }
        }
        System.out.println(girlFriend);
    }
}
