package com.zahiar.kubernetesstrtademo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KubernetesStrtaDemoApplication

fun main(args: Array<String>) {
	runApplication<KubernetesStrtaDemoApplication>(*args)
}
