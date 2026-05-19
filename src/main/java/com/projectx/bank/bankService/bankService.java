package com.projectx.bank.bankService;

import com.projectx.bank.model.Account;
import com.projectx.bank.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bankService {

    @Autowired
    private AccountRepo repo;
    private Account account;
    public Account createAccount(final Account account) {

        return repo.save(account);
    }

    public List<Account> getAllAccounts(){
        return repo.findAll();
    }
    public Account getAccountById(Integer id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Account not found with id " + id));
    }
}
