package kz.azan.radio

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("app")
data class AppConfig(
    val username: String,
    val password: String,
)
