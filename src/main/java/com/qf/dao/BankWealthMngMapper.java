package com.qf.dao;

import com.qf.pojo.BankWealthMng;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BankWealthMngMapper {
    //查所有
    List<BankWealthMng> findAll();
}
