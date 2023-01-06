package com.example.demo.exception

class StudentNotFoundException(
    var messageError: String
) : Exception(messageError){
    constructor(): this("terjadi error"){}
}