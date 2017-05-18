package com.daferpi.kotlin.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by abelfernandez on 18/05/2017.
 */
@SpringBootApplication
open class App {
}

fun main(args:Array<String>) {
    SpringApplication.run(App::class.java, *args)
}