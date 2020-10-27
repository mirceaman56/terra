package com.terra.terramain

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TerraMainApplication

fun main(args: Array<String>) {
	runApplication<TerraMainApplication>(*args)
}
