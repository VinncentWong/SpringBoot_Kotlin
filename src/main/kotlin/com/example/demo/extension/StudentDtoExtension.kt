package com.example.demo.extension

import com.example.demo.dto.StudentDto
import com.example.demo.entity.Departement
import com.example.demo.entity.Student

fun StudentDto.toEntity(
    nama: String,
    kelas: String,
    departement: Departement
): Student = Student(nama, kelas, departement)