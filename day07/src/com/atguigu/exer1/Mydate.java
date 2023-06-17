package com.atguigu.exer1;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 *
 * * MyDate类包含:
 * private成员变量year, month,day;并为每一个属性定义 getter, setter 方法;
 */
public class Mydate implements Comparable{
    private int year;
    private int month;
    private int day;

    public Mydate() {
    }

    public Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Mydate){
            Mydate m = (Mydate)o;

        //比较年
        int minusYear = this.getYear() - m.getYear();
        if (minusYear != 0){
            return minusYear;
        }
        //比较月
        int minusMonth = this.getMonth() - m.getMonth();
        if (minusMonth != 0){
            return minusMonth;
        }
        //比较日
        return this.getDay()-m.getDay();
    }
        throw new RuntimeException("传入的数据类型不一致");
    }
}
