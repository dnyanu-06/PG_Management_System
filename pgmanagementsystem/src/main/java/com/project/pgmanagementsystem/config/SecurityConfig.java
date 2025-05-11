//package com.project.pgmanagementsystem.config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import com.project.pgmanagementsystem.entity.UserDetails;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .authorizeHttpRequests(auth -> auth
//                .requestMatchers("/admin/**").hasRole("ADMIN")
//                .requestMatchers("/**").permitAll()
//            )
//            .formLogin()
//            .and()
//            .logout()
//            .and()
//            .csrf().disable(); // Disable CSRF (only for testing)
//
//        return http.build();
//    }
//
////    @Bean
////    public InMemoryUserDetailsManager userDetailsService() {
////        UserDetails admin = User.withDefaultPasswordEncoder()
////            .username("admin")
////            .password("admin123")
////            .roles("ADMIN")
////            .build();
////
////        return new InMemoryUserDetailsManager(admin);
////    }
//}
