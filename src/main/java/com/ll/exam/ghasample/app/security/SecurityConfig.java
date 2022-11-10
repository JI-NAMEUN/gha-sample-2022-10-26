package main.java.com.ll.exam.ghasample.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .antMatchers("/favicon.ico").permitAll()
                                .antMatchers("/resource/**").permitAll()
                                .antMatchers("/gen-file/**").permitAll()
                                .antMatchers("/actuator/**").permitAll()
                                .anyRequest().authenticated()
                )
                .formLogin();

        return http.build();
    }
}