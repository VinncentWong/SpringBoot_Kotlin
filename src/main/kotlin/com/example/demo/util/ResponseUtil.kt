package com.example.demo.util

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component

object ResponseUtil{
    fun sendResponse(message: String, code: Int, success: Boolean, data: Any): ResponseEntity<Response>{
        val response: Response = Response(message, code, success, data)
        return ResponseEntity.status(code).body(response)
    }
}