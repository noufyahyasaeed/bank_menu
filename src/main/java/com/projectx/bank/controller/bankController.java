package com.projectx.bank.controller;


import com.projectx.bank.bankService.bankService;
import com.projectx.bank.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/bank-system")
public class bankController {
    @Autowired
    private bankService bankservice;


    //need Update balance function tiggered by a button  on the front end in a link
    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return bankservice.createAccount(account);

    }

    //need to get balance from one db !! and udate if deposit or withraw i need real db
    @GetMapping(value = "accounts/{id}")
    public Account getAccountById(@PathVariable Integer id) {
    //maybe display a page here ?
        // that has two buttons withdraw and deposit
        return bankservice.getAccountById(id);
    }

   /* @GetMapping("/accounts")
    public List<Account> getAllAccounts() {

        return bankservice.getAllAccounts();
    }*/
}
