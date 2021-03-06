package com.travelcoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        http.cors().disable();
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/").permitAll()
 //               .anyRequest().authenticated()
                .anyRequest().permitAll()
            .and()
                .logout().permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
//            .withUser("costin@travelcoin.com").password("password").roles("USER").and()
//            .withUser("jamil@travelcoin.com").password("password").roles("USER").and()
            .withUser("stefan@travelcoin.com").password("password").roles("USER");
    }
}