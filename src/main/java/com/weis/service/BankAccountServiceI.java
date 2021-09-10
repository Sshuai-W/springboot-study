package com.weis.service;

import com.weis.dao.BankAccountMapper;
import com.weis.entity.BankAccount;
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
        return null;
    }

    @Override
    public int insertBankAccount(BankAccount bankAccount) {
        return bankAccountMapper.insertAccount(bankAccount);
    }

    @Override
    public int insertBankAccount(List<BankAccount> bankAccounts) {
        return 0;
    }

    @Override
    public int deleteBankAccountById(Integer id) {
        return 0;
    }

    @Override
    public int lessenBalance(Integer id, BigDecimal money) {
        bankAccountMapper.lessenBalance(id, money);
        return 0;
    }

    @Override
    public int addBalance(Integer id, BigDecimal money) {
        bankAccountMapper.addBalance(id, money);
        return 0;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transfer(Integer formId, Integer receiveId, BigDecimal money) {
        lessenBalance(formId,money);
        if (money.equals(new BigDecimal(20))){
            throw new RuntimeException("转账出错");
        }
        addBalance(receiveId,money);
    }
}
