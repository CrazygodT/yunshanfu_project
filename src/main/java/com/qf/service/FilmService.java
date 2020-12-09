package com.qf.service;

import com.qf.pojo.Film;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FilmService {
    //查所有
    List<Film> findAll();
    //查单个
    Film findById(@Param("fid") Integer fid);

}
