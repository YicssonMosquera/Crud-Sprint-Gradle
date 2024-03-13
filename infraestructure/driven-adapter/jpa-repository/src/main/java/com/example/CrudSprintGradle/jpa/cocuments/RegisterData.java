package com.example.CrudSprintGradle.jpa.cocuments;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Entity
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Register")
public class RegisterData {

    @Id
    private Long id;

    @Column(name = "Primer_nombre")
    private  String firs_name;

    @Column(name = "Segundo_nombre")
    private  String secund_name;

    @Column(name = "Primer_apellido")
    private  String surName;

    @Column(name = "Segundo_apellido")
    private  String second_surName;

    @Column(name = "Edad")
    private  Integer age;

    @Column(name = "Feccha_nacimiento")
    private  Date birthdate;
}
