package _02_structural_patterns._06_adapter._02_after.security;

/**
 * 기존의 Target Interface
 */
public interface UserDetailsService {

    UserDetails loadUser(String username);

}
