package com.accountservice.service;

import com.accountservice.entity.Account;
import com.accountservice.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements  AccountService {
    private final AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> getAccountById(int id) {
        return accountRepository.findById(id);
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(int id, Account account) {
        if (accountRepository.existsById(id)) {
            account.setAccountID(id);
            return accountRepository.save(account);
        }
        return null;
    }

    @Override
    public void deleteAccount(int id) {
        accountRepository.deleteById(id);
    }

    @Override
    public Account findByEmail(String email) {
        return accountRepository.findByEmail(email);
    }

    @Override
    public Account findByAccountName(String accountName) {
        return accountRepository.findByAccountName(accountName);
    }

    @Override
    public List<Account> findByRoleRoleId(int roleId) {
        return accountRepository.findByRoleRoleId(roleId);
    }

    @Override
    public List<Account> findByRoleName(String roleName) {
        return accountRepository.findByRoleRoleName(roleName);
    }

    @Override
    public List<Account> searchAccountsByEmail(String emailPattern) {
        return accountRepository.findByAccountNameContaining(emailPattern);
    }

    @Override
    public boolean checkEmailExists(String email) {
        return accountRepository.existsByEmail(email);
    }

}
