package com.example.simbirsoft_kotlin_training

class Book(
    override val price: Double,
    override val wordCount: Int
) : Publication {
    override fun getType(): String {
        return if (wordCount <= 1000) {
            "Flash Fiction"
        } else if (wordCount <= 7500) {
            "Short Story"
        } else {
            "Novel"
        }
    }
}