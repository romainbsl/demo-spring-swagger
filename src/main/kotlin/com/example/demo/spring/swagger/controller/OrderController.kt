package com.example.demo.spring.swagger.controller

import com.example.demo.spring.swagger.data.Order
import com.example.demo.spring.swagger.data.orders
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/order")
class OrderController {

  @RequestMapping("/list")
  fun list() : List<Order> {
    return orders
  }
}