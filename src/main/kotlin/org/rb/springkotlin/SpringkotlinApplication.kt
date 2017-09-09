package org.rb.springkotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringkotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringkotlinApplication::class.java, *args)
}
