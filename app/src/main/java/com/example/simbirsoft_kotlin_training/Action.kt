package com.example.simbirsoft_kotlin_training

sealed class Action {
    object Registration : Action()
    data class Login(val user: User) : Action()
    object Logout : Action()
}