package com.shuaige.controller;

import com.shuaige.bean.Accounts;
import com.shuaige.dao.AccountsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @Autowired
    private AccountsMapper accountsMapper;

    @RequestMapping("/")
    public String home(){
        Accounts accounts = accountsMapper.findById(1);
        System.out.println(accounts);
        return "去你吗的";
    }
}
