package com.weis.dao;

import com.weis.entity.BankAccount;
import org.apache.ibatis.annotations.Param;

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

    int insertAccountList(@Param("bankAccountList") List<BankAccount> bankAccountList);

    int lessenBalance(Integer id, BigDecimal money);

    int addBalance(Integer id, BigDecimal money);

    BankAccount selectById(Integer id);

    int deleteBankAccountByIds(@Param("ids") List<Integer> ids);

    int updateAccounts(List<BankAccount> list);
}
