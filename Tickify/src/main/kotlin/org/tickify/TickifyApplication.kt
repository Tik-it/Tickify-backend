package org.tickify

import lombok.Getter
import lombok.Setter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.tickify.model.Client

@SpringBootApplication
class TickifyApplication

fun main(args: Array<String>) {
    runApplication<TickifyApplication>(*args)
}

