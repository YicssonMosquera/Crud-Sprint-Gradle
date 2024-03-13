package com.example.CrudSprintGradle.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterJsonData implements Serializable {

    @JsonProperty("Primer_nombre")
    private  String firs_name;

    @JsonProperty("Segundo_nombre")
    private  String secund_name;

    @JsonProperty("Primer_apellido")
    private  String surName;

    @JsonProperty("Segundo_apellido")
    private  String second_surName;

    @JsonProperty("edad")
    private  Integer age;

    @JsonProperty("fecha_nacimiento")
    private  Date birthdate;

    @JsonProperty("id")
    private  Long id;
}
