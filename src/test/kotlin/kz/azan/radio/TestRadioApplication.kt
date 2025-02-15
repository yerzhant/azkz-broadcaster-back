package kz.azan.radio

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<RadioApplication>().with(TestcontainersConfiguration::class).run(*args)
}
