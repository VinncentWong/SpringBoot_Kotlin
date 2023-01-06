package com.example.demo.app.student

import com.example.demo.dto.StudentDto
import com.example.demo.util.Response
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
class StudentController(
    val studentService: StudentService
){
    @PostMapping("/create")
    fun createStudent(@RequestBody @Valid dto: StudentDto): ResponseEntity<Response>{
        return this.studentService.createStudent(dto)
    }

    @GetMapping("/get/{id}")
    fun getStudent(@PathVariable("id") id:Long): ResponseEntity<Response>{
        return this.studentService.findStudent(id)
    }
}