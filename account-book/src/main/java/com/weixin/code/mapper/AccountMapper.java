package com.weixin.code.mapper;

import com.weixin.code.model.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    Account selectByPrimaryKey(Integer id);

    List<Account> selectAll();

    List<Account> findListByDate(@Param("openId")String openId,@Param("start") String start, @Param("end") String end);

    int updateByPrimaryKey(Account record);
}