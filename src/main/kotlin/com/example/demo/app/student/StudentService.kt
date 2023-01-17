package com.example.demo.app.student

import com.example.demo.dto.StudentDto
import com.example.demo.entity.Departement
import com.example.demo.entity.Student
import com.example.demo.exception.StudentNotFoundException
import com.example.demo.extension.toEntity
import com.example.demo.util.Response
import com.example.demo.util.ResponseUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class StudentService(
    @Autowired
    val studentRepo: StudentRepository,
){

    fun createStudent(dto: StudentDto): ResponseEntity<Response>{
        val student: Student = dto.toEntity(dto.nama, dto.kelas, dto.departement)
        val departement: Departement = Departement(dto.departement.namaDepartement, student)
        student.departement = departement
        this.studentRepo.save(student)
        return ResponseUtil.sendResponse("sukses menambahkan student", HttpStatus.CREATED.value(), true, student)
    }

    fun findStudent(id: Long): ResponseEntity<Response>{
        val student: Student = this.studentRepo.findById(id).orElseThrow(){StudentNotFoundException("data student tidak ditemukan")}
        return ResponseUtil.sendResponse("sukses menemukan student", HttpStatus.OK.value(), true, student)
    }
}