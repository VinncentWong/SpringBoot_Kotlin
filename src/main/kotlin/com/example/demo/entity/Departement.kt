package com.example.demo.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import lombok.ToString

@Entity
@ToString(exclude = ["student"])
data class Departement(
    var namaDepartement: String,

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    var student: Student?,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
){}