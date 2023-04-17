package com.weis.Enum;

/**
 * @ClassName RMB
 * @Description TODO
 * @Author weis
 * @Date 2022/4/8 18:08
 * @Version
 */
public enum RMB {
    ONE(1),FIVE(5),TEN(10);

    Integer size;

    RMB() {
    }

    RMB(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
