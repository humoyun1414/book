package uz.spring.euroclimate.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {
  @Bean
  PasswordEncoder passwordEncoder() {
    return PasswordEncoderFactories.createDelegatingPasswordEncoder();
  }

  @Bean
  SecurityWebFilterChain securityWebFilterChain(final ServerHttpSecurity http) {
    return http.httpBasic()
        .disable()
        .formLogin()
        .disable()
        .logout()
        .disable()
        .csrf()
        .disable()
        .authorizeExchange()
        .anyExchange()
        .permitAll()
        .and()
        .build();
  }
}
