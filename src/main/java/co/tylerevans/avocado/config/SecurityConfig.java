package co.tylerevans.avocado.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public final void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/**");
    }

//    @Override
//    protected void configure(final HttpSecurity http) throws Exception {
//        http
//                // don't secure these routes
//                .authorizeRequests()
//                .antMatchers("/", "/doLogin", "/static/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                        // use form Login
//                .formLogin()
//                .loginPage("/")
//                .loginProcessingUrl("/doLogin")
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .defaultSuccessUrl("/home", true)
//                .permitAll()
//                .and()
//                .logout()
//                .logoutUrl("/logout")
//                .permitAll()
//                .and()
//                .csrf().disable();
//
//
//    }

}
