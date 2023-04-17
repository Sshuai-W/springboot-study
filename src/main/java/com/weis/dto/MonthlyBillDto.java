package com.weis.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Iterator;

/**
 * @ClassName MonthlyBill
 * @Description TODO
 * @Author weis
 * @Date 2022/4/19 16:32
 * @Version
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonthlyBillDto {

    @JSONField(name = "GuestName")
    private String guestName;

    @JSONField(name = "Month")
    private String month;

    @JSONField(name = "Nights")
    private Integer nights;

    public Iterator<String> iterator(){
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };
    }
}
