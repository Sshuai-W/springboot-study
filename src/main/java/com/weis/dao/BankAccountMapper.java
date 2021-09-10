package com.weis.dao;

import com.weis.entity.BankAccount;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName BankAccount
 * @Description TODO
 * @Author weis
 * @Date 2021/9/9 14:00
 * @Version
 */
public interface BankAccountMapper {

    int insertAccount(BankAccount bankAccount);

    int insertAccountList(List<BankAccount> bankAccountList);

    int lessenBalance(Integer id, BigDecimal money);

    int addBalance(Integer id, BigDecimal money);

}
