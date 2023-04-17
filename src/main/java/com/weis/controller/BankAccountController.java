package com.weis.controller;

import com.weis.Enum.ResponseEnum;
import com.weis.annotations.aop.LogAnnotations;
import com.weis.entity.BankAccount;
import com.weis.response.HttpResultResponse;
import com.weis.service.BankAccountServiceI;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class BankAccountController {

    @Autowired
    private BankAccountServiceI bankAccountService;

    @PostMapping("/insert")
    public HttpResultResponse<Void> insertBankAccount(@RequestBody List<BankAccount> list) {
        if (list.size() == 1) {
            BankAccount bankAccount = list.get(0);
            int res = bankAccountService.insertBankAccount(bankAccount);
            if (res == -1){
                return HttpResultResponse.error(ResponseEnum.REQUEST_ERROR_DEFAULT,null);
            }
        } else {
            bankAccountService.insertBankAccount(list);
        }
        return HttpResultResponse.success();
    }

    @GetMapping("/searchById")
    @LogAnnotations
    public HttpResultResponse<BankAccount> searchById(@RequestParam Integer id){
        BankAccount bankAccount = bankAccountService.selectById(id);
        if (bankAccount == null){
            return HttpResultResponse.error(ResponseEnum.NOT_FOUND,null);
        }
        return HttpResultResponse.success(bankAccount);
    }

    @PostMapping("/deleteBankAccountByIds")
    @LogAnnotations
    public HttpResultResponse<Void> deleteBankAccountByIds(@RequestBody List<Integer> ids){
        int res = bankAccountService.deleteBankAccountByIds(ids);
        return HttpResultResponse.success();
    }

    @GetMapping("/transfer")
    public HttpResultResponse<Void> addMoney(Integer fromId, Integer receiveId, BigDecimal money) {
        bankAccountService.transfer(fromId, receiveId, money);
        return HttpResultResponse.success();
    }

    @PostMapping("/updateBankAccount")
    @LogAnnotations
    public HttpResultResponse<Void> updateBankAccount(@RequestBody List<BankAccount> bankAccountList){
        int res = bankAccountService.updateBankAccount(bankAccountList);
        return HttpResultResponse.success();
    }

}
