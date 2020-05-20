package first.registration.app.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import first.registration.app.springsecurity.model.User;
import first.registration.app.springsecurity.web.dto.UserRegistrationDto;


public interface UserService extends UserDetailsService {
	
	User findByEmail(String email);
	User save(UserRegistrationDto registration);
}
