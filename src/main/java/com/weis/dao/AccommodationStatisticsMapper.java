package com.weis.dao;

import com.weis.dto.MonthlyBillDto;

import java.util.List;

/**
 * @ClassName AccommodationStatisticsMapper
 * @Description TODO
 * @Author weis
 * @Date 2022/4/19 16:38
 * @Version
 */
public interface AccommodationStatisticsMapper {

    List<MonthlyBillDto> getAllMonthlyBills();

}
