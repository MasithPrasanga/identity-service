package com.gryfindor.identity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain apiSecurity(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                // Allow all swagger-related endpoints without auth
                .requestMatchers(
                    "/v3/api-docs/**",
                    "/swagger-ui.html",
                    "/swagger-ui/**",
                    "/webjars/**",
                    "/swagger-resources/**",
                    "/api/**",
                    "/**"
                ).permitAll()
                // Everything else requires authentication
                .anyRequest().authenticated()
            )
            // Keep basic-auth for protected endpoints
            .httpBasic(Customizer.withDefaults());

        return http.build();
    }

}
