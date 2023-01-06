package com.example.demo.util

data class Response(
    var message: String,
    var code: Int,
    var success: Boolean,
    var data: Any
) {}