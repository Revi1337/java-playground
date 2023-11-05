package _02_structural_patterns._06_adapter._02_after.security;

/**
 * 기존의 Adapter.
 * Client 가 어떤 interface 를 기반으로 코드를 사용하고있냐를 봐야한다.
 * - 여기서는 UserDetailsService, UserDetails Interface 가 곧 Target Interface 에 해당한다.
 */
public class LoginHandler {

    UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUsername();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
