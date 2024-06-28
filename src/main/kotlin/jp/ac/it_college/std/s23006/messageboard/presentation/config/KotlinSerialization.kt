package jp.ac.it_college.std.s23006.messageboard.presentation.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.KotlinSerializationJsonHttpMessageConverter
import kotlinx.serialization.json.Json

@Configuration
class KotlinSerialization {

    @Bean
    fun json(): Json {
        return Json {
            prettyPrint = true
            isLenient = true
            ignoreUnknownKeys = true
        }
    }

    @Bean
    fun kotlinSerializationJsonHttpMessageConverter(): KotlinSerializationJsonHttpMessageConverter {
        return KotlinSerializationJsonHttpMessageConverter(json())
    }
}