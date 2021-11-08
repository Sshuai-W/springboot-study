package com.weis.entity;

import java.util.Objects;

/**
 * @ClassName Student
 * @Description TODO
 * @Author weis
 * @Date 2021/10/16 16:20
 * @Version
 */
public class Student {

    private int code;

    private int name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return code == student.code && name == student.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }
}
