package com.itheima.Stream.myreflect6;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class Student {
    private String  name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void study(){
        System.out.println("学生在学习");
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}