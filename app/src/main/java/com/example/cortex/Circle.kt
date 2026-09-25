package com.example.cortex

import kotlin.math.PI


class Circle(xval: Int, yval: Int, val radius: Double): Shape(xval,yval) {
    fun area(): Double {
        return PI * radius * radius
    }
}