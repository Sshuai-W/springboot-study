package com.weis.controller;

import com.weis.entity.BankAccount;
import com.weis.service.interfacel.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName BankAccountController
 * @Description TODO
 * @Author weis
 * @Date 2021/9/9 10:45
 * @Version
 */
@RestController
@RequestMapping("/bankAccount")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @PostMapping("/insert")
    public void insertBankAccount(@RequestBody List<BankAccount> list) {
        if (list.size() == 1) {
            BankAccount bankAccount = list.get(0);
            bankAccount.setDeleteFlag(false);
            System.out.println(bankAccount);
            bankAccountService.insertBankAccount(list.get(0));
        } else {
            bankAccountService.insertBankAccount(list);
        }
    }

    /*    @PostMapping("/insert")
        public void insertBankAccount(@RequestBody BankAccount bankAccount) {
                System.out.println(bankAccount);
    //            bankAccountService.insertBankAccount(list.get(0));
        }*/
    @GetMapping("/addMoney")
    public void addMoney(Integer fromId, Integer receiveId, BigDecimal money) {
        bankAccountService.transfer(fromId, receiveId, money);
    }


}
