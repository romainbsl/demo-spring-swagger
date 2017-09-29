package com.example.demo.spring.swagger.controller

import com.example.demo.spring.swagger.data.Product
import com.example.demo.spring.swagger.data.storage
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product")
class ProductController {

  @RequestMapping("/list")
  fun list() : List<Product> {
    return storage
  }
}