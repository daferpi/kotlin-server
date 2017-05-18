package com.daferpi.kotlin.example

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by abelfernandez on 18/05/2017.
 */
@RestController
class HelloSpringBootController {

    @RequestMapping(value = "/")
    fun helloSpringBoot() = "Hello Springboot"
}
