package com.accountservice.config;

import com.accountservice.entity.Account;
import com.accountservice.entity.Role;
import com.accountservice.repository.AccountRepository;
import com.accountservice.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final AccountRepository accountRepository;

    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        if (roleRepository.count() > 0 || accountRepository.count() > 0) {
            Role adminRole = new Role();
            adminRole.setRoleName("ADMIN");
            roleRepository.save(adminRole);

            Role userRole = new Role();
            userRole.setRoleName("USER");
            roleRepository.save(userRole);

            Account admin = new Account();
            admin.setAccountName("admin");
            admin.setEmail("admin@gmail.com");
            admin.setPassword("123");
            admin.setRole(adminRole);
            accountRepository.save(admin);

            Account user = new Account();
            user.setAccountName("user");
            user.setEmail("user@gmail.com");
            user.setPassword("123");
            user.setRole(userRole);
            accountRepository.save(user);
        }

    }
}