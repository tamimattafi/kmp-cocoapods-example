package com.attafitamim.demo.kmp.cocoapods

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform