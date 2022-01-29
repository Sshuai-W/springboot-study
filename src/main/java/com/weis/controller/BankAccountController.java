package com.weis.controller;

import com.weis.common.RequestEnum;
import com.weis.entity.BankAccount;
import com.weis.response.HttpResultResponse;
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
    public HttpResultResponse<Void> insertBankAccount(@RequestBody List<BankAccount> list) {
        if (list.size() == 1) {
            BankAccount bankAccount = list.get(0);
            bankAccount.setDeleteFlag(false);
            System.out.println(bankAccount);
            int res = bankAccountService.insertBankAccount(bankAccount);
            if (res == -1){
                return HttpResultResponse.error(RequestEnum.REQUEST_ERROR_DEFAULT,null);
            }
        } else {
            bankAccountService.insertBankAccount(list);
        }
        return HttpResultResponse.success();
    }

    @GetMapping("/transfer")
    public void addMoney(Integer fromId, Integer receiveId, BigDecimal money) {
        bankAccountService.transfer(fromId, receiveId, money);
    }


}
