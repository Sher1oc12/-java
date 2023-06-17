package com.atguigu.java;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 *-、枚举类的使用
 * 1.枚举类的理解:类的对象只有有限个，确定的。我们称此类为枚举类
 * 2.当需要定义一组常量时，强烈建议使用枚举类
 * 3.如果枚举类中只有一个对象，则可以作为单例模式的实现方式。
 *
 * 二、如何定义枚举类
 * 方式一: jdk5.0之前，自定义枚举类
 * 方式二: jdk5.0，可以使用enum关键字定义枚举类
 *
 *  三、Enum类的主要方法:
 * ➢values()方法:返回枚举类型的对象数组。该方法可以很方便地遍历所有的
 * 枚举值。
 * ➢valueOf(String str):可以把个字符 串转为对应的枚举类对象。要求字符
 * 串必须是枚举类对象的“名字”。如不是，会有运行时异常:
 * llegalArgumentException。
 * ➢toString():返回当前枚举类对象常量的名称
 *
 *四、使用enum关键字定义的枚举类实现接口的情况
 *情况一:实现接口，在enum类中实现抽象方法
 *
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }
}

//自定义枚举类
class Season{
    //声明Season对象的属性:private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //1.私有化类的构造器,并给对象属性赋值
    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;

        this.seasonDesc = seasonDesc;
    }

    //3.提供当前枚举类的多个对象:public static final修饰
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINTER = new Season("冬天","冰天雪地");

    //4.其他诉求：获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //4.其他诉求：提供toString
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
