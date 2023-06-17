package com.atguigu.java;

/**
 * @Auther:𝓜𝓸𝓻𝓲𝓪𝓻𝓽𝔂
 * @Date:
 * @Description:
 */
public class User {
    private String name ;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public int compareTo(Object o) {
        if (o instanceof User){
            User user = (User)o;
            int compare = this.name.compareTo(user.name);
            if (compare != 0){
                return compare;
            }else{
                return Integer.compare(this.age , user.age);
            }
        }else{
            throw new RuntimeException("输入的类型不匹配");
        }
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
