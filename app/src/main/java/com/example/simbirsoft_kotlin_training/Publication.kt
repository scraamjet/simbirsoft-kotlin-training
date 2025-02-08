package com.example.simbirsoft_kotlin_training

interface Publication {
    val price: Double
    val wordCount: Int
    fun getType(): String
}