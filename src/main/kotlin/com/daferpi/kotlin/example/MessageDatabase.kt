package com.daferpi.kotlin.example

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

/**
 * Created by abelfernandez on 18/05/2017.
 */
@Component
class MessageDatabase {
    private val messages = mutableListOf<Message>()

    @PostConstruct
    private fun init() {
        messages.add(Message("Esto es un ejemplo"))
    }

    fun getMessages() = messages
}