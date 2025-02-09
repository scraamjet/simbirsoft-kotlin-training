package com.example.simbirsoft_kotlin_training

interface AuthCallback {
    fun authSuccess(user: User)
    fun authFailed(reason: String)
}