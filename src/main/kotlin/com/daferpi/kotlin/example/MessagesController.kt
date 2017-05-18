package com.daferpi.kotlin.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by abelfernandez on 18/05/2017.
 */
@RestController
class MessagesController {

    @Autowired
    private lateinit var database:MessageDatabase

    @RequestMapping("/message",method = arrayOf(RequestMethod.GET))
    fun messages() = database.getMessages()
}