package com.qf.dao;

import com.qf.pojo.BankProcelamation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BankProcelamationMapper {
    //查所有
    List<BankProcelamation> findAll();
}
