package org.tickify

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TickifyApplication

fun main(args: Array<String>) {
    runApplication<TickifyApplication>(*args)
}
