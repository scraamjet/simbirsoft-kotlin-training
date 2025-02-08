package com.example.simbirsoft_kotlin_training

class Magazine(
    override val price: Double,
    override val wordCount: Int
) : Publication {
    override fun getType(): String {
        return "Magazine"
    }
}