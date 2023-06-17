package com.atguigu.exer1;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 *
 *
 * *定义一个Employee类。
 * 该类包含: private 成员变量name, age, birthday,其中birthday为MyDate类的对象;
 * 并为每一个属性定义getter, setter 方法;
 * 并重写toString方法输出name, age, birthday
 */
public class Employee implements Comparable{

    private String name;
    private int age;
    private Mydate birthday;

    public Employee() {
    }

    public Employee(String name, int age, Mydate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
//按name排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee e = (Employee)o;
            return this.name.compareTo(e.name);
        }
        throw new RuntimeException("传入的数据类型不一致");
    }
}
