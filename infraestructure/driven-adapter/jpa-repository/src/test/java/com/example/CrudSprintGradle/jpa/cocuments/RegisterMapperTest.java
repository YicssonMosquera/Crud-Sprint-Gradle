package com.example.CrudSprintGradle.jpa.cocuments;

import com.example.CrudSprintGradle.domain.Register;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


import java.sql.Date;


@ExtendWith(MockitoExtension.class)
class RegisterMapperTest {

    @InjectMocks
    RegisterMapper mapper;

    Register register = Register.builder()
            .id(Long.valueOf(1))
            .firs_name("prueba").secund_name("Prueba").surName("Prueba")
            .second_surName("Prueba").age(12).birthdate(Date.valueOf("2022-04-06")).build();

    RegisterData registerData = RegisterData.builder()
            .id(Long.valueOf(1))
            .firs_name("prueba").secund_name("Prueba").surName("Prueba")
            .second_surName("Prueba").age(12).birthdate(Date.valueOf("2022-04-06")).build();


    @Test
    void getRegister() {

    }

    @Test
    void registerDataMapper() {
    }
}