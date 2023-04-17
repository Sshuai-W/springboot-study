package com.weis.service.interfacel;

import com.weis.entity.BankAccount;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName BankAccountService
 * @Description TODO
 * @Author weis
 * @Date 2021/9/9 11:34
 * @Version
 */
public interface BankAccountService {

    BankAccount selectById(Integer id);

    int insertBankAccount(BankAccount bankAccount);

    int insertBankAccount(List<BankAccount> bankAccounts);

    int deleteBankAccountById(Integer id);

    int deleteBankAccountByIds(List<Integer> ids);

    int lessenBalance(Integer id, BigDecimal money);

    int addBalance(Integer id, BigDecimal money);

    void transfer(Integer formId, Integer receiveId, BigDecimal money);

    int updateBankAccount(List<BankAccount> bankAccountList);
}
