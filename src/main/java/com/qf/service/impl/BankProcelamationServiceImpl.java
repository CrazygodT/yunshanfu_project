package com.qf.service.impl;

import com.qf.dao.BankProcelamationMapper;
import com.qf.pojo.BankProcelamation;
import com.qf.service.BankProcelamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankProcelamationServiceImpl implements BankProcelamationService {
    @Autowired
    BankProcelamationMapper bankProcelamationMapper;
    @Override
    public List<BankProcelamation> findAll() {
        return bankProcelamationMapper.findAll();
    }
}
