package com.daferpi.kotlin.example

/**
 * Created by abelfernandez on 18/05/2017.
 */
class Message() {
    lateinit var message:String
    constructor(message: String):this() {
        this.message = message
    }
}