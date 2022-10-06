package com.example.pushnotifications

data class PushContent(
    val type: PushTypes,
    val content: String,
)