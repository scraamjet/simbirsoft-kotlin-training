package com.example.simbirsoft_kotlin_training.task2

sealed class Action {
    object Registration : Action()
    data class Login(val user: User) : Action()
    object Logout : Action()
}