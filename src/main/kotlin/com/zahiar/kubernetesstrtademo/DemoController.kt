package com.zahiar.kubernetesstrtademo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @GetMapping("/")
    fun welcome() = "Welcome to Kubernetes STRTA Demo!"

}
