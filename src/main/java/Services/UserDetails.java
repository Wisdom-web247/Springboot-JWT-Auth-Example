package Services;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

public interface UserDetails {
    Authentication authentication =
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );

    UserDetails userDetails = (UserDetails) authentication.getPrincipal();
// userDetails.getUsername()
// userDetails.getPassword()
// userDetails.getAuthorities()

}
