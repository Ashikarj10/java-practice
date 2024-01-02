package edu.training.SpringSecurity.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class mySecurity{
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	
    @Bean
	public UserDetailsService userCredentialsService() 
    {
		UserDetails ac=User.withUsername("Admin").password(passwordEncoder().encode("admin")).roles("ADMIN").build();
		UserDetails cu=User.withUsername("Customer").password(passwordEncoder().encode("customer")).roles("CUSTOMER").build();
		
		InMemoryUserDetailsManager myDet = new InMemoryUserDetailsManager(ac,cu);
		return myDet;
		
	}
	
    @Bean
    public SecurityFilterChain securityConfig(HttpSecurity hs) throws Exception
    {
		hs.csrf()
		.disable()
		.authorizeHttpRequests()
//		.requestMatchers("/admin")
//		.hasRole("ADMIN")
//		.requestMatchers("/customer")
//		.hasRole("CUSTOMER")
		.requestMatchers("/public")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin();
		return hs.build();
	 
 }
}
