package DesignPattern.builder;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/10/21
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description 学生类
 * 构造器设计模式
 */
public class Student {

    int age;
    String name;
    String address;
    String classname;

    public Student(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.address = builder.address;
        this.classname = builder.classname;
    }

    public String tostring() {
        return this.name + "," + this.age + "," + this.address + "," + this.classname;
    }

    public static class Builder {
        int age;
        String name;
        String address;
        String classname;

        public Builder() {
        }

        public Builder setage(int var) {
            this.age = var;
            return this;
        }

        public Builder setname(String var) {
            this.name = var;
            return this;
        }

        public Builder setaaddress(String var) {
            this.address = var;
            return this;
        }

        public Builder setclassname(String var) {
            this.classname = var;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
