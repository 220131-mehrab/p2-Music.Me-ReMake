package com.revature.p2musicme.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Order
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().withUser("user1").password("wcp").roles("USER");
    }

    // disables the default security configuration
     @Override
     protected void configure(HttpSecurity http) throws Exception {
     http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
     }*/
}
