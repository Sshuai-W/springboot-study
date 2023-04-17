package com.weis.service;

import com.weis.Enum.ResponseEnum;
import com.weis.dao.BankAccountMapper;
import com.weis.entity.BankAccount;
import com.weis.exception.BankAccountException;
import com.weis.service.interfacel.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName BankAccountServiceI
 * @Description TODO
 * @Author weis
 * @Date 2021/9/9 11:56
 * @Version
 */
@Service
public class BankAccountServiceI implements BankAccountService {

    @Autowired
    BankAccountMapper bankAccountMapper;

    @Override
    public BankAccount selectById(Integer id) {
        return bankAccountMapper.selectById(id);
    }

    @Override
    public int insertBankAccount(BankAccount bankAccount) {
        bankAccountMapper.insertAccount(bankAccount);
        return bankAccount.getId();
    }

    @Override
    public int insertBankAccount(List<BankAccount> bankAccounts) {
        return bankAccountMapper.insertAccountList(bankAccounts);
    }

    @Override
    public int deleteBankAccountById(Integer id) {
        return 0;
    }

    @Override
    public int deleteBankAccountByIds(List<Integer> ids) {
        return bankAccountMapper.deleteBankAccountByIds(ids);
    }

    @Override
    @Transactional
    public int lessenBalance(Integer id, BigDecimal money) {
        bankAccountMapper.lessenBalance(id, money);
        return 0;
    }

    @Override
    @Transactional
    public int addBalance(Integer id, BigDecimal money) {
        int res = bankAccountMapper.addBalance(id, money);
        return res;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transfer(Integer formId, Integer receiveId, BigDecimal money) {
        BankAccount bankAccount = bankAccountMapper.selectById(formId);
        if (bankAccount.getBalance().compareTo(money) < 0) {
            throw new BankAccountException(ResponseEnum.BALANCE_NOT_ENOUGH, "余额不足");
        }
        lessenBalance(formId, money);
        addBalance(receiveId, money);
    }

    @Override
    public int updateBankAccount(List<BankAccount> bankAccountList) {
        int res = bankAccountMapper.updateAccounts(bankAccountList);
        return res;
    }


}
