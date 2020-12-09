package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.pojo.Film;
import com.qf.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/film")
@CrossOrigin
public class FilmController {
    @Autowired
    FilmService filmService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public BaseResp findAll(){
        List<Film> all = filmService.findAll();
        BaseResp baseResp = new BaseResp();
        baseResp.setMyjs(all);
        baseResp.setCode(200);
        baseResp.setMessage("查询成功");
        return baseResp;
    }
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public BaseResp findById(@RequestBody Map map){
        Film all = filmService.findById(Integer.valueOf(map.get("fid").toString()));
        BaseResp baseResp = new BaseResp();
        baseResp.setMyjs(all);
        baseResp.setCode(200);
        baseResp.setMessage("查询成功");
        return baseResp;
    }
}
