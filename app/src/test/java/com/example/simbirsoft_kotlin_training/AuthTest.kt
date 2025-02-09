package com.example.simbirsoft_kotlin_training

import com.example.simbirsoft_kotlin_training.task2.Action
import com.example.simbirsoft_kotlin_training.task2.AuthCallback
import com.example.simbirsoft_kotlin_training.task2.Type
import com.example.simbirsoft_kotlin_training.task2.User
import com.example.simbirsoft_kotlin_training.task2.auth
import com.example.simbirsoft_kotlin_training.task2.doAction
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

    @Test
    fun testAuthFunction() {
        auth {
            println("Updating cache...")
        }
    }

    @Test
    fun testAuthCallbackWithAgeCheck() {
        val user = User(1, "Dima", 25, Type.FULL)
        val authCallback = object : AuthCallback {
            override fun authSuccess() {
                println("Authentication successful!")
            }

            override fun authFailed() {
                println("Authentication failed!")
            }
        }
        auth(user, authCallback) {
            println("Updating cache...")
        }
    }

    @Test
    fun testDoActionWithLogin() {
        val user = User(1, "Dima", 25, Type.FULL)
        val authCallback = object : AuthCallback {
            override fun authSuccess() {
                println("Authentication successful!")
            }

            override fun authFailed() {
                println("Authentication failed!")
            }
        }
        doAction(Action.Login(user), authCallback)
    }
}