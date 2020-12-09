package com.qf.service.impl;

import com.qf.dao.FilmMapper;
import com.qf.pojo.Film;
import com.qf.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    FilmMapper filmMapper;
    @Override
    public List<Film> findAll() {
        return filmMapper.findAll();
    }

    @Override
    public Film findById(Integer fid) {
        return filmMapper.findById(fid);
    }
}
