package jp.ac.it_college.std.s23006.messageboard.presentation.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.session.web.http.CookieHttpSessionIdResolver
import org.springframework.session.web.http.HttpSessionIdResolver

@Configuration
class HttpSessionConfig {

    @Bean
    fun httpSessionIdResolver(): HttpSessionIdResolver {
        return CookieHttpSessionIdResolver()
    }
}