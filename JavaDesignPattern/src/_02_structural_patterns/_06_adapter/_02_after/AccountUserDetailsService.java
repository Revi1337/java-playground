package _02_structural_patterns._06_adapter._02_after;

import _02_structural_patterns._06_adapter._02_after.security.UserDetails;
import _02_structural_patterns._06_adapter._02_after.security.UserDetailsService;

/**
 * 새로운 Adapter
 */
public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        AccountUserDetails accountUserDetails = new AccountUserDetails(accountByUsername);
        return accountUserDetails;
    }
}
