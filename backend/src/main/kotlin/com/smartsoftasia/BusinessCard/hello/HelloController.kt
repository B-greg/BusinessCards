package com.smartsoftasia.BusinessCard.hello

/**
 * Created by gregoire on 15/07/17.
 */

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class HelloController {

    @RequestMapping("/")
    fun index(): String {
        return "Greetings from Spring Boot!"
    }

}