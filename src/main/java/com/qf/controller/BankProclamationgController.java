package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.pojo.BankProcelamation;
import com.qf.service.BankProcelamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bankProclamationg")
@CrossOrigin
public class BankProclamationgController {
    @Autowired
    BankProcelamationService bankProcelamationService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public BaseResp findAll(){
        List<BankProcelamation> all = bankProcelamationService.findAll();
        BaseResp baseResp = new BaseResp();
        baseResp.setMyjs(all);
        baseResp.setCode(200);
        baseResp.setMessage("查询成功");
        return baseResp;
    }
}
