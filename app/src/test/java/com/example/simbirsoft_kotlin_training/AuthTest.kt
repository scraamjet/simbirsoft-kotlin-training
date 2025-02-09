package com.example.simbirsoft_kotlin_training

import org.junit.Test

class AuthTest {
    @Test
    fun testAuthCallback() {
        val authCallback = object : AuthCallback {
            override fun authSuccess() {
                println("Authentication successful!")
            }

            override fun authFailed() {
                println("Authentication failed!")
            }
        }

        authCallback.authSuccess()
        authCallback.authFailed()
    }
}