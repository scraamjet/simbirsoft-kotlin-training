package com.example.simbirsoft_kotlin_training.task1

class Magazine(
    override val price: Double,
    override val wordCount: Int
) : Publication {
    override fun getType(): String {
        return "Magazine"
    }
}