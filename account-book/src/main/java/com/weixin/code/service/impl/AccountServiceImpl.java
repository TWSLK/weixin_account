package com.weixin.code.service.impl;

import com.weixin.code.mapper.AccountMapper;
import com.weixin.code.model.Account;
import com.weixin.code.service.AccountService;
import com.weixin.code.utils.DateFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Account account) {
        accountMapper.insert(account);
    }

    @Override
    public List<Account> findHistoryAccount(String openId,String start, String end) {
        return accountMapper.findListByDate(openId,start,end);
    }

}
