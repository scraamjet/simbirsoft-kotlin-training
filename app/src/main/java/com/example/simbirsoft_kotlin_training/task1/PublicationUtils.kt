package com.example.simbirsoft_kotlin_training.task1

fun buy(publication: Publication) {
    println(
        "The purchase is complete. The purchase amount was %.2f€"
            .format(publication.price)
    )
}