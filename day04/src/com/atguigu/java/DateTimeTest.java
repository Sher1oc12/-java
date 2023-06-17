package com.atguigu.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 *jdk 8之前的日期时间的API测试
 * 1.System类中currentTimeMillis();
 * 2.java.util.Date和子类java.sqL.Date
 * 3.SimpLeDateFormat
 * 4.Calendar
 *
 */
public class DateTimeTest {
    /*
    SimpleDateFormat的使用: SimpLeDateFormat对日期Date类的格式化和解析

    1.两个操作:
1.1格式化:日期--->字符串
1.2解析:格式化的逆过程，字符串----> 日期

2. SimpLeDateFormat的实例化


     */

    @Test
    public void testSimpleDateFormat() throws ParseException {
//实例化SimpleDateFormat:使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化:日期--->字符串
        Date date =new Date();
        System.out.println(date);
       String format = sdf.format(date);
        System.out.println(format);

        //解析：格式化的逆过程，字符串--->日期
        String str = "2023/5/21 下午5:08";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        //************************************
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        String format1 = sdf1.format(date);
        System.out.println(format1);

    }
      /*
        练习一:字符串"2020-09-08"转换为java.sql.Date
         */

    @Test
    public void testExer() throws ParseException {
        String birth = "2020-09-08";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(birth);
//        System.out.println(date);
        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }

    /*
    Calendar日历类的使用
     */
    @Test
    public void testCalendar(){
//        1.实例化
//        方式一:创建其子类(GregorianCalendar)的对象。
//        方式二:调用其静态方法getInstance( )
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getClass());

    }
}
