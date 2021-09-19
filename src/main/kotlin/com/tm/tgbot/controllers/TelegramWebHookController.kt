package com.tm.tgbot.controllers

import com.tm.tgbot.println
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TelegramWebHookController {

    @GetMapping("/helloworld")
    fun event(): String {
        println("hello world controller")

        return "testing"
    }
}