package com.kashyap.habit.tracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform