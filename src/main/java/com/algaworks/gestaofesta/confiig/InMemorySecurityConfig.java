package com.algaworks.gestaofesta.confiig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;


@Configuration
public class InMemorySecurityConfig {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception{
        builder
        .inMemoryAuthentication()
        .withUser("joel").password("{noop}2024").roles("USER")
        .and()
        .withUser("admin").password("{noop}123").roles("USER");
    }

}
