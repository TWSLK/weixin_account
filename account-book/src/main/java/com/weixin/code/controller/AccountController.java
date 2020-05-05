package com.weixin.code.controller;

import com.weixin.code.model.Account;
import com.weixin.code.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/save")
    public String saveAccount(@RequestBody Account account){
        accountService.save(account);
        return "success";
    }


    @GetMapping("/history")
    public List<Account> findHistoryAccount(@RequestParam(name = "openId")String openId,@RequestParam(name = "start",required = false) String start,@RequestParam(name = "end",required = false)String end){
         return accountService.findHistoryAccount(openId,start,end);
    }

}
