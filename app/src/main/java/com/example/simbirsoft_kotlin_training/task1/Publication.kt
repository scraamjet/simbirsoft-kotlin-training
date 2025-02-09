package com.example.simbirsoft_kotlin_training.task1

interface Publication {
    val price: Double
    val wordCount: Int
    fun getType(): String
}