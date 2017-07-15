package com.smartsoftasia.BusinessCard

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.CommandLineRunner
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import java.util.*


@SpringBootApplication
open class BusinessCardApplication

fun main(args: Array<String>) {
    SpringApplication.run(BusinessCardApplication::class.java, *args)
}

@Bean
fun commandLineRunner(ctx: ApplicationContext): () -> Unit {
    return {

        println("Let's inspect the beans provided by Spring Boot:")

        val beanNames = ctx.getBeanDefinitionNames()
        Arrays.sort(beanNames)
        for (beanName in beanNames) {
            println(beanName)
        }

    }
}