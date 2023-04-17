package com.weis.dto;

import java.util.List;

/**
 * @ClassName TestDto
 * @Description TODO
 * @Author weis
 * @Date 2022/5/23 22:05
 * @Version
 */
public class TestDto {

    private List<Long> ids;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "TestDto{" +
                "ids=" + ids +
                '}';
    }
}
