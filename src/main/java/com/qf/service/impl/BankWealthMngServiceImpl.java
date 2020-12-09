package com.qf.service.impl;

import com.qf.dao.BankWealthMngMapper;
import com.qf.pojo.BankWealthMng;
import com.qf.service.BankWealthMngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankWealthMngServiceImpl implements BankWealthMngService {
    @Autowired
    BankWealthMngMapper bankWealthMngMapper;
    @Override
    public List<BankWealthMng> findAll() {
        return bankWealthMngMapper.findAll();
    }
}
