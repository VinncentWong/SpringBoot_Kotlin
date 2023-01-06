package com.example.demo.entity

import jakarta.persistence.*
import lombok.NoArgsConstructor

@Entity
data class Student(
    var nama: String,
    var kelas: String,
    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL], mappedBy = "student")
    var departement: Departement,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
){}