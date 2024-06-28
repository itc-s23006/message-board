package jp.ac.it_college.std.s23006.messageboard.presentation.config

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity

open class WebSecurityConfigurerAdapter {

    open fun configure(http: HttpSecurity) {}
    open fun configure(auth: AuthenticationManagerBuilder) {}
}
