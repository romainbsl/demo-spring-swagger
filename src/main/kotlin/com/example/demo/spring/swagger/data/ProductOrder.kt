package com.example.demo.spring.swagger.data

data class Product(val id: Int, val name: String)
data class Order(val id: Int, val user: String, val products: List<Product>)

val screen = Product(1, "Screen")
val motherboard = Product(2, "Motherboard")
val memory2 = Product(3, "Memory 2Gb")
val memory4 = Product(4, "Memory 4Gb")
val memory8 = Product(5, "Memory 8Gb")
val hdd128 = Product(6, "HDD 128Gb")
val hdd256 = Product(7, "HHD 256Gb")
val keyboard = Product(8, "keyboard")
val mouse = Product(9, "mouse")

val storage = listOf(screen, motherboard, memory2, memory4, memory8, hdd128, hdd256, keyboard, mouse)

val order1 = Order(1, "Romain", listOf(screen, motherboard, memory2, hdd128))
val order2 = Order(1, "Maxime", listOf(screen, motherboard, memory4, hdd128, keyboard, mouse))
val order3 = Order(1, "Romain", listOf(screen, motherboard, memory4, hdd256, keyboard, mouse))
val order4 = Order(1, "Pierre", listOf(screen, motherboard, memory8, hdd256, keyboard, mouse))

val orders = listOf(order1, order2, order3, order4)