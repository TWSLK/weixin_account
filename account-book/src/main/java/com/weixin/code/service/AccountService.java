package com.weixin.code.service;

import com.weixin.code.model.Account;

import java.util.List;


public interface AccountService {
     void save(Account account);
     List<Account> findHistoryAccount(String openId,String start,String end);
}
