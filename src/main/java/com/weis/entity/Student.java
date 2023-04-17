package com.weis.entity;

import lombok.Data;

import java.util.Objects;

/**
 * @ClassName Student
 * @Description TODO
 * @Author weis
 * @Date 2021/10/16 16:20
 * @Version
 */
@Data
public class Student {

    private int code;

    private String name;

    public Student() {
    }

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public void fun(){
        System.out.println("fun");
    }

    public void fun(int i){
        System.out.println("fun: " + i);
    }

    protected int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return code == student.code && name == student.name;
    }

/*    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }*/
}
