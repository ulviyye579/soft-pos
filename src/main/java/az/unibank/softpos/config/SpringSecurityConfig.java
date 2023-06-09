package az.unibank.softpos.config;

import az.unibank.softpos.security.JWTAuthorizationFilter;
import az.unibank.softpos.utils.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
@RequiredArgsConstructor
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    private final Util util;

    private static final String[] AUTH_WHITELIST = {
            "/v2/api-docs",
            "/v2/soft/pos/corporate-customer",
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/securityV2",
            "/swagger-ui.html",
            "/webjars/**",
            "/v3/api-docs/**",
            "/swagger-ui/**",
            "/v1/soft/pos/user",
            "/v1/soft/pos/user/*",
            "/actuator/health",
            "/actuator/health/**",
            "/actuator/prometheus"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .addFilterAfter(new JWTAuthorizationFilter(util), UsernamePasswordAuthenticationFilter.class)
                .authorizeRequests()
                .antMatchers(AUTH_WHITELIST).permitAll()
                .anyRequest().authenticated();
    }

}

