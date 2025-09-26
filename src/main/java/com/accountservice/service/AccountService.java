package com.accountservice.service;

import com.accountservice.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> getAllAccounts();

    Optional<Account> getAccountById(int id);

    Account createAccount(Account account);

    Account updateAccount(int id, Account account);

    void deleteAccount(int id);

    Account findByEmail(String email);

    Account findByAccountName(String accountName);

    List<Account> findByRoleRoleId(int roleId);

    List<Account> findByRoleName(String roleName);

    List<Account> searchAccountsByEmail(String emailPattern);

    boolean checkEmailExists(String email);
}
