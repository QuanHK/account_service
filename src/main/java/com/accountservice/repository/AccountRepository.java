package com.accountservice.repository;

import com.accountservice.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByEmail(String email);

    Account findByAccountName(String accountName);

    List<Account> findByRoleRoleId(int roleId);

    List<Account> findByRoleRoleName(String roleName);

    List<Account> findByEmailContaining(String emailPattern);

    boolean existsByEmail(String email);

    List<Account> findByRoleRoleNameAndEmailContaining(String roleName, String email);

    List<Account> findByAccountNameContaining(String accountName);
}
