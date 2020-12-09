package com.qf.dao;

import com.qf.pojo.Film;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FilmMapper {
    //查所有
    List<Film> findAll();
    //查单个
    Film findById(@Param("fid") Integer fid);
}
