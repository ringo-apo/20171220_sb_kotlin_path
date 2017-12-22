package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("dir1")
class Dir1Controller {

    @GetMapping("")
    fun index(): String {
        return "dir1/index"
    }

    @GetMapping("page1")
    fun page1(): String {
        return "dir1/page1"
    }
}