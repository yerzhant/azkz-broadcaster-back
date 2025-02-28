package kz.azan.radio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(AppConfig::class)
class RadioApplication

fun main(args: Array<String>) {
    runApplication<RadioApplication>(*args)
}
