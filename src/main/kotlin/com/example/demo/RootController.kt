package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("")
class RootController {

    @GetMapping("")
    fun index(): String {
        return "index"
    }

    @GetMapping("page1")
    fun page1(): String {
        return "page1"
    }




}