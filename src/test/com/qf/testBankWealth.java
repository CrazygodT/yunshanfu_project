package com.qf;

import com.qf.pojo.BankWealthMng;
import com.qf.service.BankWealthMngService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testBankWealth {
    @Autowired
    BankWealthMngService bankWealthMngService;
    @Test
    public void testWelth(){
        List<BankWealthMng> all = bankWealthMngService.findAll();
        System.out.println(all);
    }
}
