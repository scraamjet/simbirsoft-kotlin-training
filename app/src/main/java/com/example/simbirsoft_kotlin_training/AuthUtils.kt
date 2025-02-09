package com.example.simbirsoft_kotlin_training

inline fun auth(updateCache: () -> Unit) {
    println("Authenticating user...")
    updateCache()
    println("Authentication process completed.")
}