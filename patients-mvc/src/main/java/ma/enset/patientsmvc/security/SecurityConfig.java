package ma.enset.patientsmvc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // Active la configuration de sécurité pour l'application Spring.
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        return new InMemoryUserDetailsManager(
                User.withUsername("user1").password(passwordEncoder.encode("1234")).roles("USER").build(),
                User.withUsername("admin").password(passwordEncoder.encode("1234")).roles("USER","ADMIN").build()


                );
    }



//http://localhost:8082/admin/delete?id=3&keyword=&page=3

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
       httpSecurity.formLogin().loginPage("/login").permitAll();
       httpSecurity.rememberMe();
       httpSecurity.authorizeRequests().requestMatchers("/webjars/**","/h2-console/**").permitAll();
        httpSecurity.exceptionHandling().accessDeniedPage("/notAuthorized");
        //httpSecurity.authorizeRequests().requestMatchers("/user/**").hasRole("USER");
        //httpSecurity.authorizeRequests().requestMatchers("/admin/**").hasRole("ADMIN");
        httpSecurity.authorizeRequests().anyRequest().authenticated();

        return httpSecurity.build();
    }
}
