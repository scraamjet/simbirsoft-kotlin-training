package com.example.simbirsoft_kotlin_training

fun buy(publication: Publication) {
    println(
        "The purchase is complete. The purchase amount was %.2f€"
            .format(publication.price)
    )
}