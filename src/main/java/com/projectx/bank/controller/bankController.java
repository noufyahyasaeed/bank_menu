package com.projectx.bank.controller;


import com.projectx.bank.bankService.bankService;
import com.projectx.bank.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("api/bank")
@CrossOrigin(origins = "*")
public class bankController {
    @Autowired
    private bankService bankservice;


    //need Update balance function tiggered by a button  on the front end in a link
    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return bankservice.createAccount(account);

    }
    @PostMapping("/{accountNumber}/deposit")
    public ResponseEntity<?> deposit(@PathVariable String accountNumber, @RequestBody Map<String, BigDecimal> request) {
        try {
            BigDecimal amount = request.get("amount");
            Account updatedAccount = bankservice.deposit(accountNumber, amount);
            return ResponseEntity.ok(updatedAccount);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
        @PostMapping("/{accountNumber}/withdraw")
        public ResponseEntity<?> withdraw(@PathVariable String accountNumber, @RequestBody Map<String, BigDecimal> request) {
            try {
                BigDecimal amount = request.get("amount");
                Account updatedAccount = bankservice.withdraw(accountNumber, amount);
                return ResponseEntity.ok(updatedAccount);
            } catch (Exception e) {
                return ResponseEntity.badRequest().body(e.getMessage());
            }
        }
    }

