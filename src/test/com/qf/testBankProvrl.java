package com.qf;

import com.qf.pojo.BankProcelamation;
import com.qf.service.BankProcelamationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testBankProvrl {
    @Autowired
    BankProcelamationService bankProcelamationService;
    @Test
    public void testFindAll(){
        List<BankProcelamation> all = bankProcelamationService.findAll();
        System.out.println(all);
    }
}
