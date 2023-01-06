package com.example.demo.dto

import com.example.demo.entity.Departement
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull


data class StudentDto(
    @NotNull
    @NotBlank
    var nama: String,

    @NotNull
    @NotBlank
    var kelas: String,

    var departement: Departement
){}
