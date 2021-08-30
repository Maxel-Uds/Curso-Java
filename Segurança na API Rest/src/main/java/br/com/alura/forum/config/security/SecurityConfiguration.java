package br.com.alura.forum.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequest().antMatchers(HttpMethod.GET, "/topicos").permitAll().antMatchers(HttpMethod.GET, "/topicos/*").permitAll();
    }

    @Override
    protected void configure(WebSecurity web) throws Exception {

    }

}
