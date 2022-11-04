package az.unibank.softpos.config;

import az.unibank.softpos.security.JWTAuthorizationFilter;
import az.unibank.softpos.utils.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
@RequiredArgsConstructor
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    private final Util util;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .addFilterAfter(new JWTAuthorizationFilter(util), UsernamePasswordAuthenticationFilter.class)
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/user").permitAll()
                .anyRequest().authenticated();
    }
}

