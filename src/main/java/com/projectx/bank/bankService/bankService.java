package com.projectx.bank.bankService;

import com.projectx.bank.model.Account;
import com.projectx.bank.repo.AccountRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class bankService {

    @Autowired
    private AccountRepo repo;
    private Account account;
    public Account createAccount(final Account account) {

        return repo.save(account);
    }
    @Transactional
    public Account deposit(String accountNumber, BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero");
        }
        Account account = repo.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        account.setBalance(account.getBalance().add(amount));
        return repo.save(account);
    }
    @Transactional
    public Account withdraw(String accountNumber, BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero");
        }

        Account account = repo.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        // Check if there are sufficient funds
        if (account.getBalance().compareTo(amount) < 0) {
            throw new RuntimeException("Insufficient funds!");
        }

        account.setBalance(account.getBalance().subtract(amount));
        return repo.save(account);
    }
}

