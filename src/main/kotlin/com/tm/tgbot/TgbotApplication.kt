package com.tm.tgbot

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class TgbotApplication {

	@Bean
	fun test(): CommandLineRunner {
		return CommandLineRunner { _ ->
			println("Hello world")
		}
	}

}

fun main(args: Array<String>) {
	runApplication<TgbotApplication>(*args)
}
